package com.codedifferently.tdd.calculator;

public class CurrentUnitsMode{
    protected String currentUnit;
    final String DEGREES = "Degrees";
    final String RAD = "Radians";


    public CurrentUnitsMode(){
        this.currentUnit = DEGREES;
    }

    public void switchUnitsMode(){
        this.currentUnit = DEGREES.equals(currentUnit) ? RAD : DEGREES;
    }

    public String switchUnitsMode(String mode){
        switch (mode){
            case "Degrees":
                return this.currentUnit = DEGREES;

            case "Radians":
                return  this.currentUnit = RAD;

            default:
                System.out.println("This Mode " +mode +" Doesn't Exist. Please select Degrees or Radians :)");
            return null;
        }

    }

    public String getSwitchUnitsMode(){
        return this.currentUnit;
    }

}

