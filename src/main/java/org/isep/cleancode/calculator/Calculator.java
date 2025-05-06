package org.isep.cleancode.calculator;

public class Calculator {
    public double evaluateMathExpression(String expression) {
        return 0;
    }

    public double convertStringToDouble(String expression){
        return ParseManager.parseDouble(expression);
    }

    public double addition(String expression) {
        Double sum = 0.0;
        for (String value : ParseManager.splitExpressionByPlus(expression)) {
            sum += ParseManager.parseDouble(value.trim());
        }
        return sum;
    }

    public double substract(String expression){
        String [] factors = ParseManager.splitExpressionByMinus(expression);
        double sum = ParseManager.parseDouble(factors[0].trim());
        for(int i = 1; i<factors.length; i++){
            sum -= ParseManager.parseDouble(factors[i].trim());
        }
        return sum;
    }



}
