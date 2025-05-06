package org.isep.cleancode;

import org.isep.cleancode.calculator.Calculator;
import org.isep.cleancode.calculator.ParseManager;

public class Main {
    public static void main(String[] args) {

        Calculator c = new Calculator();
        System.out.println(c.substract("12 - 12"));

    }
}