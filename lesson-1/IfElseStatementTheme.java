public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("#1. Перевод псевдокода на язык Java");
        int age = 36;
        boolean femaleGender = true;
        double height = 1.79;
        char firstLetterName = "Roman".charAt(0);
        if (age > 36) {
            System.out.println("Вам больше 20 лет");
        } else {
            System.out.println("Вам меньше 20 лет");
        }
        if (!femaleGender) {
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
        int num3 = 23;
        if (num3 != 0) {
            System.out.print("Число " + num3 + " является ");
            if (num3 > 0) {
                System.out.print("положительным");
            } else {
                System.out.print("отрицательным");
            }
            if (num3 % 2 == 0) {
                System.out.println(" и четным");
            } else {
                System.out.println(" и нечетным");
            }
        } else {
            System.out.println("Числом является " + num3);
        }

        System.out.println("\n#4. Поиск одинаковых цифр в числах");
        int num4 = 123;
        int num5 = 123;
        int hundredsNum1 = num4 / 100;
        int hundredsNum2 = num5 / 100;
        int tensNum1 = num4 / 10 % 10;
        int tensNum2 = num5 / 10 % 10;
        int onesNum1 = num4 % 10;
        int onesNum2 = num5 % 10;
        if (hundredsNum1 != hundredsNum2 && tensNum1 != tensNum2 && onesNum1 != onesNum2) {
            System.out.println("Числа " + num4 + " и " + num5 + " не имеют одинаковых цифр!");
        } else {
            if (hundredsNum1 == hundredsNum2) {
                System.out.println("Числа " + num4 + " и " + num5 + " имеют одинаковую цифру = " +
                        num4 / 100 + " в разряде #3"
                );
            }
            if (tensNum1 == tensNum2) {
                System.out.println("Числа " + num4 + " и " + num5 + " имеют одинаковую цифру = " + 
                        num4 / 10 % 10 + " в разряде #2"
                );
            }
            if (onesNum1 == onesNum2) {
                System.out.println("Числа " + num4 + " и " + num5 + " имеют одинаковую цифру = " +
                        num4 % 10 + " в разряде #1"
                );
            }
        }

        System.out.println("\n#5. Определение символа по его коду");
        char symbol = '\u0057';
        if (symbol >= 'A' && symbol <= 'Z') {
            System.out.println(symbol + " is a big letter");
        } else if (symbol >= 'a' && (int) symbol <= 'z') {
            System.out.println(symbol + " is a small letter");
        } else if (symbol >= '0' && (int) symbol <= '9') {
            System.out.println(symbol + " is a number");
        } else {
            System.out.println(symbol + " is not a number and not a letter");
        }

        System.out.println("\n#6. Подсчет суммы вклада и начисленных банком %");
        int depositTotal = 300000;
        int accruedInterest = depositTotal * 7 / 100;
        if (depositTotal > 3000000) {
            accruedInterest = depositTotal * 10 / 100;
        } else if (depositTotal < 100000) {
            accruedInterest = depositTotal * 5 / 100;
        }
        System.out.println("Total deposit = " + depositTotal + "; accrued interest = " +
                accruedInterest + "; total = " + (depositTotal + accruedInterest)
        );

        System.out.println("\n#7. Определение оценки по предметам");
        int historyResultScore = 59;
        int historyScore = 4;

        if (historyResultScore <= 60) {
            historyScore = 2;
        } else if (historyResultScore > 60 && historyResultScore <= 73) {
            historyScore = 3;
        } else if (historyResultScore > 91) {
            historyScore = 5;
        }
        int programmingResultScore = 91;
        int programmingScore = 4;
        if (programmingResultScore <= 60) {
            programmingScore = 2;
        } else if (programmingResultScore > 60 && programmingResultScore <= 73) {
            programmingScore = 3;
        } else if (programmingResultScore > 91) {
            programmingScore = 5;
        }
        System.out.println("Оценка " + historyScore + " по истории\nОценка " + programmingScore +
                " по программированию"
        ); 
        System.out.println("Средний балл по предметам " +
                (double) (historyScore + programmingScore) / 2
        );
        System.out.println("Средний процент по предметам = " +
                (double) (historyResultScore + programmingResultScore) / 2
        );

        System.out.println("\n#8. Расчет прибыли за год");
        int rentAppartment = 5000;
        int averageIncome = 13000;
        int costPrice = 9000;
        int yearIncome = 12 * (averageIncome - costPrice - rentAppartment);
        if (yearIncome < 0) {
            System.out.println(yearIncome);
        } else {
            System.out.println("+" + yearIncome);
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