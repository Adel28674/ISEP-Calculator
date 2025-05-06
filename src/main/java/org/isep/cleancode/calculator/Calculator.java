package org.isep.cleancode.calculator;

public class Calculator {
    public double evaluateMathExpression(String expression) {

        expression = expression.replaceAll(" ", "");

        String[] additionParts = StringSpliter.splitExpressionByPlus(expression);
        double total = 0.0;

        for (String addPart : additionParts) {
            String[] subtractionParts = StringSpliter.splitExpressionByMinus(addPart);
            double subResult = handleMultiplication(subtractionParts[0]);

            for (int i = 1; i < subtractionParts.length; i++) {
                subResult -= handleMultiplication(subtractionParts[i]);
            }

            total += subResult;
        }

        return total;

    }

    private double handleMultiplication(String expression) {
        String[] factors = StringSpliter.splitExpressionByStar(expression);
        double result = ParserManager.parseDouble(factors[0]);

        for (int i = 1; i < factors.length; i++) {
            result *= ParserManager.parseDouble(factors[i]);
        }

        return result;
    }

    public double convertStringToDouble(String expression){
        return ParserManager.parseDouble(expression);
    }

    public double addition(String expression) {
        Double sum = 0.0;
        for (String factor : StringSpliter.splitExpressionByPlus(expression)) {
            sum += ParserManager.parseDouble(factor);
        }
        return sum;
    }

    public double substract(String expression){
        String [] factors = StringSpliter.splitExpressionByMinus(expression);

        double sum = ParserManager.parseDouble(factors[0]);
        for (int i = 1; i < factors.length; i++) {
            sum -= ParserManager.parseDouble(factors[i]);
        }

        return sum;
    }

    public double multiply(String expression){
        String [] factors = StringSpliter.splitExpressionByStar(expression);

        double sum = ParserManager.parseDouble(factors[0]);
        for (int i = 1; i < factors.length; i++) {
            sum *= ParserManager.parseDouble(factors[i]);
        }

        return sum;
    }
}
