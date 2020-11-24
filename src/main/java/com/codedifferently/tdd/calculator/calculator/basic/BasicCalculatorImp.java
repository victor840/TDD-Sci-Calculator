package com.codedifferently.tdd.calculator.calculator.basic;

import com.codedifferently.tdd.calculator.calculator.memory.Memory;
import com.codedifferently.tdd.calculator.calculator.memory.MemoryImplementation;

import static com.codedifferently.tdd.calculator.utils.CustomConsole.*;

public class BasicCalculatorImp implements Calculator {
    protected Memory memory;

    public BasicCalculatorImp() {
        this.memory = new MemoryImplementation();
    }

    public void run() {
        String message = "";
        println("Welcome to TDD Calculator");
        message = String.format("The current Value is %d", memory.recallCurrentValue());
        println(message);
    }

    protected Double add(Double input) {
        Double sum = input + memory.recallCurrentValue();
        memory.setCurrentValue(sum);
        return sum;
    }

    protected Double subtract(Double input) {
        Double minus = memory.recallCurrentValue() - input;
        memory.setCurrentValue(minus);
        return minus;
    }

    protected Double multiply(Double input) {
        Double product = memory.recallCurrentValue() * input;
        memory.setCurrentValue(product);
        return product;
    }

    protected Double divide(Double input) {
        Double division = memory.recallCurrentValue() / input;
        memory.setCurrentValue(division);
        return division;
    }

    protected Double sq(Double input) {
        if (memory.recallCurrentValue() == 0){
            Double squared = Math.pow(input, 2);
            memory.setCurrentValue(squared);
        }
        Double squared = Math.pow(memory.recallCurrentValue(), 2);
        return squared;
    }

    protected Double sqrt(Double input) {
        if(memory.recallCurrentValue() == 0){
            Double sqRoot = Math.sqrt(input); // did not work with "sqrt" function had to switch it to Math.sqrt for it to work
            //stated that it was a "Recursive call"
            memory.setCurrentValue(sqRoot);
        }
       Double sqRoot = Math.sqrt(memory.recallCurrentValue());
        return sqRoot;
    }
}
