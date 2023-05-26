package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public static double calculate(String expression) {
        String[] elements = expression.split(" ");
        int num1 = 0;
        int num2 = 0;
        try {
            num1 = Integer.parseInt(elements[0]);
            num2 = Integer.parseInt(elements[2]);
        } catch (RuntimeException e) {
            throw new RuntimeException("Введенные числа должны быть целыми!");
        }
        char sign = elements[1].charAt(0);
        return switch (sign) {
            case '+'-> Math.addExact(num1, num2);
            case '-' -> Math.subtractExact(num1, num2);
            case '/' -> {
                if (num2 == 0) {
                    throw new RuntimeException("Делитель должен быть больше нуля!");
                }
                yield num1 / num2;
            }
            case '*' -> Math.multiplyExact(num1, num2);
            case '%' -> {
                if (num2 <= 0) {
                    throw new RuntimeException("Делитель должен быть больше нуля!");
                }
                yield num1 % num2;
            }
            case '^' -> Math.pow(num1,num2);
            default -> throw new RuntimeException("Данная операция не поддерживается!");
        };
    }
}