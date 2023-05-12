package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public void calculate(int num1, char sign, int num2) {
        int result = 1;
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
                result = num1 / num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '%':
                if (num2 == 0) {
                    break;
                }
                result = num1 % num2;
                break;
            case '^':
                if (num1 == 1 || num1 == 0) {
                    result = num1;
                    break;
                }
                for (int i = 0; i < num2; i++) {
                    result *= num1;
                }
                break;
            default:
                System.out.println("Такой операции нет!");
                return;
        }
        if (sign == '%' | sign == '/' && num2 == 0) {
            System.out.println("Деление на ноль!");
        } else {
            System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
        }
    }
}