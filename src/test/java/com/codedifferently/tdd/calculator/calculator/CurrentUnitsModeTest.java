package com.codedifferently.tdd.calculator.calculator;

import com.codedifferently.tdd.calculator.CurrentUnitsMode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CurrentUnitsModeTest {

    CurrentUnitsMode currentUnitsMode;

    @Before
    public void setUp(){

        currentUnitsMode = new CurrentUnitsMode();
    }

    @Test
    public void switchUnitsMode(){
        //Given

        currentUnitsMode.switchUnitsMode();

        //When

        String expected = "Radians";
        String actual = currentUnitsMode.getSwitchUnitsMode();

        //Then

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void switchUnitsMode2(){
        //Given

        currentUnitsMode.switchUnitsMode("Radians");

        //When

        String expected = "Radians";
        String actual = currentUnitsMode.getSwitchUnitsMode();

        //Then

        Assert.assertEquals(expected,actual);

    }
}
