package com.codedifferently.tdd.calculator.calculator.scientific;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class ScientificCalculatorTest {

    SciCalculator sciCalculator;

    @Before
    public void setUp(){
        sciCalculator = new SciCalculator();
    }

    @Test
    public void logTest(){
        //Given
        sciCalculator.memory.setCurrentValue(1.0);

        //When

        Double expected = 0.0;
        Double actual = sciCalculator.log(1.0);

        //Then
        Assert.assertEquals(expected, actual);




    }

}
