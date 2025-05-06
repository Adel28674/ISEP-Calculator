package org.isep.cleancode.calculator;

public class StringSpliter {

    public static String[] splitExpressionByPlus(String expression) {
        return expression.split("\\+");
    }

    public static String[] splitExpressionByMinus(String expression) {
        return expression.split("\\-");
    }

    public static String[] splitExpressionByStar(String expression) {
        return expression.split("\\*");
    }

}
