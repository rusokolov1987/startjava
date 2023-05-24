package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public double calculate(String expression) {
        String[] elements = expression.split(" ");
        int num1 = Integer.parseInt(elements[0]);
        int num2 = Integer.parseInt(elements[2]);
        char sign = elements[1].charAt(0);
        switch (sign) {
            case '+':
                return Math.addExact(num1, num2);
            case '-':
                return Math.subtractExact(num1, num2);
            case '/':
                if (num2 == 0) {
                    break;
                }
                return  (double) num1 / num2;
            case '*':
                return Math.multiplyExact(num1, num2);
            case '%':
                if (num2 == 0) {
                    break;
                }
                return num1 % num2;
            case '^':
                return Math.pow(num1,num2);
            default:
                System.out.println("Данная операция не поддерживается!");
                return 0.0;
        }
        if (sign == '%' | sign == '/' && num2 == 0) {
            System.out.println("Деление на ноль!");
        }
        return 0.0;
    }
}