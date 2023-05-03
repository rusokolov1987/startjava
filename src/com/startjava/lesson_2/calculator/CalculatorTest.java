package com.startjava.lesson_2.calculator;
import com.startjava.lesson_2.calculator.Calculator;
import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String option = "да";
        while (!option.toLowerCase().equals("нет")) {
            if (option.toLowerCase().equals("да")) {
                System.out.println("Введите первое число");
                int num1 = scanner.nextInt();
                System.out.println("Введите знак математической операции");
                scanner.nextLine();
                String sign = scanner.nextLine();
                System.out.println("Введите второе число");
                int num2 = scanner.nextInt();
                calculator.calculate(num1, sign.charAt(0), num2);
                scanner.nextLine();
            }
            System.out.println("Вы хотите продолжить вычисления? (да/нет)");
            option = scanner.nextLine();
        }
    }
}