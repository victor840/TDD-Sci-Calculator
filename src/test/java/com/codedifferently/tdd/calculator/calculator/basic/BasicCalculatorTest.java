package com.codedifferently.tdd.calculator.calculator.basic;

import org.junit.Assert;
import org.junit.Test;

public class BasicCalculatorTest {
    @Test
    public void addTest(){
        //Given
        BasicCalculatorImp basicCalc = new BasicCalculatorImp();
        basicCalc.memory.setCurrentValue(5.0);
        Double expected = 8.0;
        Double actual = basicCalc.add(3.0);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void subtractTest(){
        //Given
        BasicCalculatorImp basicCalc = new BasicCalculatorImp();
        basicCalc.memory.setCurrentValue(10.0);
        Double expected = 5.0;
        Double actual = basicCalc.subtract(5.0);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void multiplyTest(){
        //Given
        BasicCalculatorImp basicCalc = new BasicCalculatorImp();
        basicCalc.memory.setCurrentValue(10.0);
        Double expected = 20.0;
        Double actual = basicCalc.multiply(2.0);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void divideTest(){
        BasicCalculatorImp basicCalc = new BasicCalculatorImp();
        basicCalc.memory.setCurrentValue(12.0);
        Double expected = 2.0;
        Double actual = basicCalc.divide(6.0);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sqTest(){
        BasicCalculatorImp basicCalc = new BasicCalculatorImp():
        basicCalc.memory.setCurrentValue(4.0);
        Double expected = 16.0;
        Double actual = basicCalc.sq(4.0);

        Assert.assertEquals(expected, actual);
    }
}
