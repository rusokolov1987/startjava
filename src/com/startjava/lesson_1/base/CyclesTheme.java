package com.startjava.lesson_1.base;

import java.util.*;

public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("#1. Подсчет суммы четных и нечетных чисел");
        int sumEvenNumbers = 0;
        int sumOddNumbers = 0;
        int counter = -10;
        do {
            if (counter % 2 == 0) {
                sumEvenNumbers += counter;
            } else {
                sumOddNumbers += counter;
            }
            counter++;
        } while (counter <= 21);
        System.out.println("В промежутке [-10; 21] сумма четных чисел = " + sumEvenNumbers +
                ", сумма нечетных = " + sumOddNumbers);

        System.out.println("\n#2. Вывод чисел в интервале (min и max) в порядке убывания");
        int a = 10;
        int b = 5;
        int c = -1;
        int max = a;
        if (max < b) {
            max = b;
        } else if (max < c) {
            max = c;
        }
        int min = a;
        if (min > b) {
            min = b;
        } if (min > c) {
            min = c;
        }
        for (int i = max - 1; i > min; i--) {
            System.out.printf("%2d", i);
        }

        System.out.println("\n\n#3. Вывод реверсивного числа и суммы его цифр");
        int num = 1234;
        int copyNum = num;
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            System.out.print(digit);
            num /= 10;
        }
        System.out.println("\nСумма цифр числа " + copyNum + " = " + sum);

        System.out.println("\n#4. Вывод чисел на консоль в несколько строк");
        int start = 1;
        int end = 23;
        int countString = 0;
        for (int i = start; i <= end; i += 2) {
            System.out.printf("%4d", i);
            countString++;
            if (countString % 5 == 0) {
                System.out.println();
            }
        }
        int countZero = 0;
        if (end % 5 > 0) {
            countZero = 5 - countString % 5;
        }
        for (int i = 0; i < countZero; i++) {
            System.out.printf("%4d", 0);
            if (i == countZero - 1) {
                System.out.println();
            }
        }

        System.out.println("\n#5. Проверка количества двоек на четность/нечетность");
        int num1 = 3242592;
        int copyNum1 = num1;
        int count = 0;
        while (num1 > 0) {
            if (num1 % 10 == 2) {
                count++;
            }
            num1 /= 10;
        }
        System.out.println("Число " + copyNum1 + " содержит " + count +
                " (" + (count % 2 == 0 ? "четное" : "нечетное") + ") количество двоек");

        System.out.println("\n#6. Отображение фигур в консоли");
        System.out.println("Прямоугольник");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Прямоугольный треугольник");
        int height = 5;
        while (height > 0) {
            count = 0;
            while (count < height) {
                System.out.print("#");
                count++;
            }
            System.out.println();
            height--;
        }

        System.out.println("Треугольник");
        int size = 5;
        int half = (int) Math.round(size / 2.0);
        int step = 0;
        do {
            count = 0;
            if (size >= half) {
                step++;
            } else {
                step--;
            }
            do {
                System.out.print("$");
                count++;
            } while (count != step);
            System.out.println();
            size--;
        } while (size > 0);

        System.out.println("\n#7. Отображение ASCII-символов");
        System.out.printf("%5s%8s%n", "Dec", "Char");
        for (int i = 0; i <= 122; i++) {
            if (i % 2 > 0 && i < 48) {
                System.out.printf("%5d%8c%n", i, i);
            }
            if (i >= 97 && i <= 122 && i % 2 == 0) {
                System.out.printf("%5d%8c%n", i, i);
            }
        }

        System.out.println("\n#8. Проверка, является ли число палиндромом");
        int num2 = 123123;
        int copyNum2 = num2;
        int reverse = 0;
        while (copyNum2 > 0) {
            reverse += copyNum2 % 10;
            copyNum2 /= 10;
            if (copyNum2 > 0) {
                reverse *= 10;
            }
        }
        if (num2 == reverse) {
            System.out.println("Число " + num2 + " является палиндромом");
        } else {
            System.out.println("Число " + num2 + " не является палиндромом");
        }

        System.out.println("\n#9. Определение, является ли число счастливым");
        int happyNumber = 313123;
        int rightHalf = happyNumber % 1000;
        int copyRightHalf = rightHalf;
        happyNumber /= 1000;
        int leftHalf = happyNumber;
        int copyHalfLeft = leftHalf;
        int sumLeftHalf = 0;
        int sumRightHalf = 0;
        while (leftHalf > 0) {
            sumLeftHalf += leftHalf % 10;
            sumRightHalf += rightHalf % 10;
            leftHalf /= 10;
            rightHalf /= 10;
        }
        System.out.println("Сумма цифр " + copyHalfLeft + " = " + sumLeftHalf);
        System.out.println("Сумма цифр " + copyRightHalf + " = " + sumRightHalf);
        System.out.println("Число " + (sumRightHalf == sumLeftHalf ? "является" :
                "неявляется") + " счастливым");

        System.out.println("\n#10. Вывод таблицы умножения Пифагора");
        System.out.printf("%10s%6s%5s", "ТАБЛИЦА", " " ,"ПИФАГОРА");
        System.out.println();
        for (int i = 1; i <= 9; i++) {
            if (i != 1 && i != 2) {
                System.out.printf("%d%2s", i, "|");
            } else if (i == 1) {
                System.out.printf("%3s", "|");
            } else if (i == 2) {
                System.out.printf("%s", "---------------------------\n");
                System.out.printf("%d%2s", i, "|");
            }
            for (int j = 2; j <= 9; j++) {
                if (i == 1) {
                    System.out.printf("%3d", j);
                } else {
                    System.out.printf("%3d", j * i);
                }
            }
            System.out.println();
        }
    }
}