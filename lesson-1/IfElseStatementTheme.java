public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("#1. Перевод псевдокода на язык Java");
        int age = 36;
        boolean gender = true;
        double height = 1.79;
        char firstLetterName = "Roman".charAt(0);
        if (age > 36) {
            System.out.println("Вам больше 20 лет");
        } else {
            System.out.println("Вам меньше 20 лет");
        }
        if (!gender) {
            System.out.println("Вы - женщина");
        } else {
            System.out.println("Вы - мужчина");
        }
        if (height < 1.80) {
            System.out.println("Ваш рост меньше 1.80 м");
        } else {
            System.out.println("Ваш рост больше 1.80 м");
        }
        if (firstLetterName == 'M') {
            System.out.println("Ваше имя начинается с буквы M");
        } else if (firstLetterName == 'I') {
            System.out.println("Ваше имя начинается с буквы I");
        } else {
            System.out.println("Мы не отгадали первую букву вашего имени");
        }

        System.out.println("\nПоиск max и min числа");
        int num1 = 22;
        int num2 = 42;
        if (num1 < num2) {
            System.out.println("max = " + num2);
            System.out.println("min = " + num1);
        } else if (num1 > num2) {
            System.out.println("max = " + num1);
            System.out.println("min = " + num2);
        } else {
            System.out.println("Числа равны");
        }

        System.out.println("\n#.3 Проверка числа");
        int num3 = 22;
        if (num3 != 0) {
            if (num3 > 0) {
                System.out.println("Число " + num3 + " является положительным");
            } else {
                System.out.println("Число " + num3 + " является отрицательным");
            }
            if (num3 % 2 == 0) {
                System.out.println("Число " + num3 + " является четным");
            } else {
                System.out.println("Число " + num3 + " является нечетным");
            }
        } else {
            System.out.println("Числом является 0" + num3);
        }

        System.out.println("\n#4. Поиск одинаковых цифр в числах");
        int num4 = 123;
        int num5 = 123;
        if (num4 / 100 != num5 / 100 && num4 / 10 % 10 != num5 / 10 % 10 && num4 % 10 != num5 % 10) {
            System.out.println("Числа " + num4 + " и " + num5 + " не имеют одинаковых цифр!");
        } else {
            if (num4 / 100 == num5 / 100) {
                System.out.println("Числа " + num4 + " и " + num5 + " имеют одинаковую цифру = " +
                        num4 / 100 + " в разряде #3"
                );
            }
            if (num4 / 10 % 10 == num5 / 10 % 10) {
                System.out.println("Числа " + num4 + " и " + num5 + " имеют одинаковую цифру = " + 
                        num4 / 10 % 10 + " в разряде #2"
                );
            }
            if (num4 % 10 == num5 % 10) {
                System.out.println("Числа " + num4 + " и " + num5 + " имеют одинаковую цифру = " +
                        num4 % 10 + " в разряде #1"
                );
            }
        }

        System.out.println("\n#5. Определение символа по его коду");
        char symbol = '\u0057';
        if ((int) symbol >= 65 && (int) symbol <= 90) {
            System.out.println(symbol + " is a big letter");
        } else if ((int) symbol >= 97 && (int) symbol <= 122) {
            System.out.println(symbol + " is a small letter");
        } else if ((int) symbol >= 48 && (int) symbol <= 57) {
            System.out.println(symbol + " is a number");
        } else {
            System.out.println(symbol + " is not a number and not a letter");
        }

        System.out.println("\n#6. Подсчет суммы вклада и начисленных банком %");
        int depositTotal = 300000;
        int accruedInterest = 0;
        if (depositTotal < 100000) {
           accruedInterest = depositTotal * 5 / 100;
        } else if (depositTotal >= 100000 && depositTotal <= 300000) {
            accruedInterest = depositTotal * 7 / 100;
        } else {
            accruedInterest = depositTotal * 10 / 100;
        }
        System.out.println("Total deposit = " + depositTotal + "; accrued interest = " +
                accruedInterest + "; total = " + (depositTotal + accruedInterest)
        );

        System.out.println("\n#7. Определение оценки по предметам");
        int history = 59;
        int programming = 91;
        int historyScore = 0;
        int programmingScore = 0;
        if (history <= 60) {
            historyScore = 2;
        } else if (history > 60 && history <= 73) {
            historyScore = 3;
        } else if (history > 73 && history <= 91) {
            historyScore = 4;
        } else {
            historyScore = 5;
        }
        if (programming <= 60) {
            programmingScore = 2;
        } else if (programming > 60 && history <= 73) {
            programmingScore = 3;
        } else if (programming > 73 && history <= 91) {
            programmingScore = 4;
        } else {
            programmingScore = 5;
        }
        System.out.println("Оценка " + historyScore + " по истории\nОценка " + programmingScore +
                " по программированию"
        ); 
        System.out.println("Средний балл по предметам " + (double) (historyScore +
                programmingScore) / 2
        );
        System.out.println("Средний процент по предметам = " + (double) (history + programming) / 2);

        System.out.println("\n#8. Расчет прибыли за год");
        int rentAppartment = 5000;
        int averageIncome = 13000;
        int costPrice = 9000;
        int yearIncome = averageIncome - costPrice - rentAppartment;
        if (yearIncome < 0) {
            System.out.println(yearIncome);
        } else if (yearIncome > 0) {
            System.out.println("+" + yearIncome);
        } else {
            System.out.println(yearIncome);
        }

        System.out.println("\n#9. Подсчет количества банкнот");
        int money = 567;
        int banknoteHundred = 10;
        int banknoteTen = 5;
        int banknoteOne = 50;
        if ((banknoteHundred * 100 + banknoteTen * 10 + banknoteOne) >= money) {
            if ((banknoteHundred - money / 100) >= 0) {
                banknoteHundred = money / 100;
                money = money % 100;
            } else {
                money = money - banknoteHundred * 100;
            }
            if ((banknoteTen - money / 10) >= 0) {
                banknoteTen = money / 10;
                money = money % 10;
            } else {
                money = money - banknoteTen * 10;
            }
            if ((banknoteOne - money) >= 0) {
                banknoteOne = money;
            }
            System.out.println("100 USD = " + banknoteHundred + " total = " +
                    banknoteHundred * 100 + "; 10 USD = " + banknoteTen + " total = " +
                    banknoteTen * 10 + "; 1 USD = " + banknoteOne + " total = " + banknoteOne
            );
        } else {
             System.out.println("В банкомате недостаточно средств");
        }
    }
}