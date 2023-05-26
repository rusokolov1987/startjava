package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String option = "да";
        while (!option.toLowerCase().equals("нет")) {
            if (option.toLowerCase().equals("да")) {
                launch();
            }
            System.out.println("Вы хотите продолжить вычисления? (да/нет)");
            option = scanner.nextLine();
        }
    }

    private static void show(String expression, double result) {
        System.out.println(expression + " = " +
                ((result - (int) result > 0) ? String.format("%.3f", result) : String.format("%d", (int) result)));
    }

    private static void launch() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите математическое выражение");
        String expression = scanner.nextLine();
        try {
            double result = Calculator.calculate(expression);
            show(expression, result);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage() + " Введите корректное математическое выражение!");
            launch();
        }
    }
}