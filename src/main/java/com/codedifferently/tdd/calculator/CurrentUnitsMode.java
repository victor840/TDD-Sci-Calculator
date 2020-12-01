package com.codedifferently.tdd.calculator;

public class CurrentUnitsMode{
    String currentUnit = new String();
    final String DEGREES = "Degrees";
    final String RAD = "Radians";


    public CurrentUnitsMode(){
        currentUnit = DEGREES;
    }

    public void switchUnitsMode(){
        currentUnit = DEGREES.equals(currentUnit) ? RAD : DEGREES;
    }

    public String switchUnitsMode(String mode){

        return null;
    }

}

