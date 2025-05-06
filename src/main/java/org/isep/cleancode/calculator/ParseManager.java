package org.isep.cleancode.calculator;

public class ParseManager {
    public static double parseDouble(String expression) {
        return Double.parseDouble(expression);
    }

    public static String[] splitExpressionByPlus(String expression) {
        return expression.split("\\+");
    }

    public static String[] splitExpressionByMinus(String expression) {
        return expression.split("\\+");
    }

}
