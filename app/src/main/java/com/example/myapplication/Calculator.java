package com.example.myapplication;

public class Calculator {
    public static double calculate(String expression) {
        String[] elements = expression.split(" ");
        double result = Double.parseDouble(elements[0]);
        for (int i = 1; i < elements.length; i+=2) {
            String operator = elements[i];

            double num = Double.parseDouble(elements[i + 1]);
            switch (operator) {
                case "+":
                    result += num;
                    break;
                case "-":
                    result -= num;
                    break;
                case "*":
                    result *= num;
                    break;
                case "÷":
                    result /= num;
                    break;
                default:
                    throw new IllegalArgumentException("error operation");
            }
        }
        return result;
    }

}
