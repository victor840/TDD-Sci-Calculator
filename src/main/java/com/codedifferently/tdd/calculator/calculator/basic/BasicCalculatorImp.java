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
        return null;
    }

    protected Double sq(Double input) {
        return null;
    }

    protected Double sqrt(Double input) {
        return null;
    }
}
//pushing to master branch
