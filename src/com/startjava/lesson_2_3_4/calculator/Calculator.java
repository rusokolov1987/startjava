package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public double calculate(String expression) {
        String[] expressionSymbols = expression.split(" ");
        int num1 = Integer.parseInt(expressionSymbols[0]);
        int num2 = Integer.parseInt(expressionSymbols[2]);
        char sign = expressionSymbols[1].charAt(0);
        double result = 1.0;
        switch (sign) {
            case '+':
                result = Math.addExact(num1, num2);
                break;
            case '-':
                result = Math.subtractExact(num1, num2);
                break;
            case '/':
                if (num2 == 0) {
                    break;
                }
                result = (double) num1 / num2;
                break;
            case '*':
                result = Math.multiplyExact(num1, num2);
                break;
            case '%':
                if (num2 == 0) {
                    break;
                }
                result = num1 % num2;
                break;
            case '^':
                result = Math.pow(num1,num2);
                break;
            default:
                System.out.println("Такой операции нет!");
                return 0.0;
        }
        if (sign == '%' | sign == '/' && num2 == 0) {
            System.out.println("Деление на ноль!");
        }
        return result;
    }
}