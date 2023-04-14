import java.util.*;

public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("#1. Подсчет суммы четных и нечетных чисел");
            int totalEven = 0;
            int totalOdd = 0;
            int startLine = -10;
            do {
                if (startLine % 2 == 0) {
                    totalEven += startLine;
                } else {
                    totalOdd += startLine;
                }
                startLine++;
            } while (startLine < 21);
            System.out.println("В промежутке [-10; 21] сумма четных чисел = " + totalEven + ", сумма нечетных = " + totalOdd);

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
                System.out.printf("%4d", i);
            }

        System.out.println("\n\n#3. Вывод реверсивного числа и суммы его цифр");
            int num = 1234;
            int total = 0;
            while (num != 0) {
                total += num % 10;
                System.out.print(num % 10);
                num /= 10;
            }
            System.out.println("\nСумма цифр цисла 1234 = " + total);

        System.out.println("\n#4. Вывод чисел на консоль в несколько строк");
            int begin = 1;
            int end = 24;
            int countString = 0;
            for (int i = begin + 1; i <= end; i += 2) {
                System.out.printf("%4d", i);
                countString++;
                if (countString == end / 2 && countString % 5 != 0) {
                    int size = 5 - countString % 5;
                    for (int j = 0; j < size; j++) {
                        System.out.printf("%4d", 0);
                    }
                }
                if (i % 5 == 0) {
                    System.out.println();
                }
            }

        System.out.println("\n#5. Проверка количества двоек на четность/нечетность");
            int num1 = 3242592;
            int copy = num1;
            int count = 0;
            while (num1 != 0) {
                if (num1 % 10 == 2) {
                    count++;
                }
                num1 /= 10;
            }
            System.out.println("Число " + copy + " содержит " + count + " (" + (count % 2 == 0 ? "четное" : "нечетное") + ") количество двоек");

        System.out.println("\n#6. Отображение фигур в консоли");
            System.out.println("Прямоугольник");
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 10; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            System.out.println("Прямоугольный треугольник");
            int sideA = 5;
            while (sideA != 0) {
                int grid = 0;
                while (grid != sideA) {
                    System.out.print("#");
                    grid++;
                }
                System.out.println();
                sideA--;
            }

            System.out.println("Треугольник");
            int size = 5;
            int half = (int) Math.round(size / 2.0);
            int step = 0;
            do {
                int dollar = 0;
                if (size >= half) {
                    step++;
                } else {
                    step--;
                }
                do {
                    if (size >= half) {
                        System.out.print("$");
                        dollar++;
                    } else {
                        System.out.print("$");
                        dollar++;
                    }
                } while (dollar != step);
                System.out.println();
                size--;
            } while (size > 0);

            System.out.println("\n#7. Отображение ASCII-символов");
                System.out.printf("%-5s%-5s%n", "Dec", "Char");
                for (int i = 0; i <= 127; i++) {
                    if (i % 2 != 0 && i < 48) {
                        System.out.printf("%-5d%-5c%n", i, i);
                    }
                    if (i >= 97 && i <= 122 && i % 2 == 0) {
                        System.out.printf("%-5d%-5c%n", i, i);
                    }
                }

            System.out.println("\n#8. Проверка, является ли число палиндромом");
                int num2 = 1234321;
                int copy2 = num2;
                String reverse = "";
                while (copy2 != 0) {
                    reverse += copy2 % 10;
                    copy2 /= 10;
                }
                if (num2 == Integer.parseInt(reverse)) {
                    System.out.println("Число " + num2 + " является палиндромом");
                } else {
                    System.out.println("Число " + num2 + " не является палиндромом");
                }

            System.out.println("\n#9. Определение, является ли число счастливым");
                int happyNumber = 123017;
                int totalFirstHalf = 0;
                int totalSecondHalf = 0;
                String str1 = "";
                String str2 = "";
                int counts = 0;
                while (happyNumber != 0) {
                    if (counts < 3) {
                        str1 += happyNumber % 10;
                        totalFirstHalf += happyNumber % 10;
                        happyNumber /= 10;
                        counts++;
                    } else {
                        str2 += happyNumber % 10;
                        totalSecondHalf += happyNumber % 10;
                        happyNumber /= 10;
                    }
                }
                System.out.println("Сумма цифр " + str2 + " = " + totalSecondHalf);
                System.out.println("Сумма цифр " + str1 + " = " + totalFirstHalf);
                System.out.println("Число " + (totalSecondHalf == totalFirstHalf ? "является" : "неявляется") + " счастливым");

            System.out.println("\n#10. Вывод таблицы умножения Пифагора");
                System.out.printf("%20s", "ТАБЛИЦА ПИФАГОРА\n");
                for (int i = 1; i <= 9; i++) {
                    if (i != 1 && i != 2) {
                        System.out.printf("%d%2s", i, "|");
                    } else if (i == 1) {
                        System.out.printf("%3s", "|");
                    } else if (i == 2) {
                        System.out.println("---------------------------");
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