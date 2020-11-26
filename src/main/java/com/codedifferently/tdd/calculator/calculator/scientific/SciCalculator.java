package com.codedifferently.tdd.calculator.calculator.scientific;

import com.codedifferently.tdd.calculator.CurrentUnitsMode;
import com.codedifferently.tdd.calculator.calculator.basic.BasicCalculatorImp;
import com.codedifferently.tdd.calculator.calculator.memory.Memory;
import com.codedifferently.tdd.calculator.calculator.memory.MemoryImplementation;

import static com.codedifferently.tdd.calculator.utils.CustomConsole.println;

public class SciCalculator extends BasicCalculatorImp {
    protected Memory memory;
    protected CurrentUnitsMode curUnit;


    public SciCalculator(){
       this.memory = new MemoryImplementation();

    }
    public void run() {
        String message = "";
        println(" TDD Sci-Calculator");
        message = String.format("The current Value is %d", memory.recallCurrentValue());
        println(message);
    }


}
