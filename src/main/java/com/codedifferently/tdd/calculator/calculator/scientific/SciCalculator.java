package com.codedifferently.tdd.calculator.calculator.scientific;

import com.codedifferently.tdd.calculator.CurrentUnitsMode;
import com.codedifferently.tdd.calculator.calculator.BasicCalculatorImp;
import com.codedifferently.tdd.calculator.calculator.memory.Memory;
import com.codedifferently.tdd.calculator.calculator.memory.MemoryImplementation;

import static com.codedifferently.tdd.calculator.utils.CustomConsole.println;

public class SciCalculator extends BasicCalculatorImp {
    protected Memory memory;

    public SciCalculator(){
       this.memory = new MemoryImplementation();


    }
    public void run() {
        String message = "";
        println(" TDD Sci-Calculator");
        message = String.format("The current Value is %d", memory.recallCurrentValue());
        println(message);
    }

    public Double log(Double x){
        if(memory.recallCurrentValue() == 0){
            Double logged = Math.log(x);
            memory.setCurrentValue(logged);
        }
        Double logged = Math.log(memory.recallCurrentValue());
        return logged;
    }


}
