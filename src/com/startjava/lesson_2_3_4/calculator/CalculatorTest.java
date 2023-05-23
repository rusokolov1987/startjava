package com.startjava.lesson_2_3_4.calculator;

import com.startjava.lesson_2_3_4.calculator.Calculator;
import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String option = "да";
        while (!option.toLowerCase().equals("нет")) {
            if (option.toLowerCase().equals("да")) {
                System.out.println("Введите математическое выражение");
                String expression = scanner.nextLine();
                String[] expressionSymbols = expression.split(" ");
                double result = calculator.calculate(Integer.parseInt(expressionSymbols[0]), expressionSymbols[1].charAt(0),
                        Integer.parseInt(expressionSymbols[2]));
                System.out.print(expressionSymbols[0] + " " + expressionSymbols[1] + " " + expressionSymbols[2] + " = ");
                if ((result - (int) result) > 0) {
                    System.out.printf("%.3f\n", result);
                } else {
                    System.out.printf("%d\n", (int) result);
                }
            }
            System.out.println("Вы хотите продолжить вычисления? (да/нет)");
            option = scanner.nextLine();
        }
    }
}