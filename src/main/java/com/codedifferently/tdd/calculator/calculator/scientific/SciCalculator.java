package com.codedifferently.tdd.calculator.calculator.scientific;

import com.codedifferently.tdd.calculator.calculator.basic.BasicCalculatorImp;
import com.codedifferently.tdd.calculator.calculator.memory.Memory;
import com.codedifferently.tdd.calculator.calculator.memory.MemoryImplementation;

public class SciCalculator extends BasicCalculatorImp {
    protected Memory memory;

    public SciCalculator(){
       this.memory = new MemoryImplementation();
    }

}
