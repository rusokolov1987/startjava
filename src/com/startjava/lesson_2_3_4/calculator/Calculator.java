package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public double calculate(int num1, char sign, int num2) {
        double result = 1.0;
        switch (sign) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
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
                if (num1 == 1 || num1 == 0) {
                    result = Math.pow(num1,num2);
                    break;
                }
                for (int i = 0; i < num2; i++) {
                    result *= num1;
                }
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