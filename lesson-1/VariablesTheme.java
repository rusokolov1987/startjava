public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("#1. Вывод характеристик компьютера");
            String model = "MSI";
            byte quantityCores = 6;
            short memory = 16;
            int ssd = 512;
            long memoryRate = 3200;
            float cpuMaxRate = 4.2f;
            double cpuRate = 2.3;
            boolean bluetooth = true;
            System.out.println("Модель ноутбука: " + model + "\nКоличество ядер CPU: " + quantityCores + "\n" +
                                "Оперативная память: " + memory + "\nОбъем SSD: " + ssd + "\nЧастота оперативной памяти: " + memoryRate + "\n" +
                                "Максимальная частота CPU: " + cpuMaxRate + "\nЧастота CPU: " + cpuRate + "\nНаличие Bluetooth: " + (bluetooth ? "да\n" : "нет\n")
            );

        System.out.println("#2. Расчет стоимости товара со скидкой");
            int priceBook = 200;
            int pricePensil = 100;
            int discount = 11;
            int total = priceBook + pricePensil;
            int discountTotal = total * discount / 100;
            int totalWithDiscount = total - discountTotal;
            System.out.println("Общая стоимость товаров без скидки = " + total +"\nОбщая сумма скидки = " + discountTotal + "\nОбщая стоимость товара со скидкой = " + totalWithDiscount + "\n");

        System.out.println("#3. Вывод слова JAVA");
            System.out.println("    J    a   v     v   a\n    J   a a   v   v   a a\nJ   J  aaaaa   V V   aaaaa\n JJ   a     a   V   a     a\n");

        System.out.println("#4. Вывод min и max значений целых числовых типов");
            byte maxByte = 127;
            short maxShort = 32767;
            int maxInt = Integer.MAX_VALUE;
            long maxLong = Long.MAX_VALUE;
            System.out.println("Вывод типа byte: \nmaxByte = " + maxByte);
            maxByte++;
            System.out.println("maxByte++ = " + maxByte);
            maxByte--;
            System.out.println("maxByte-- = " + maxByte);
            System.out.println("Вывод типа short: \nmaxShort = " + maxShort);
            maxShort++;
            System.out.println("maxShort++ = " + maxShort);
            maxShort--;
            System.out.println("maxShort-- = " + maxShort);
            System.out.println("Вывод типа Integer: \nmaxInt = " + maxInt);
            maxInt++;
            System.out.println("maxInt++ = " + maxInt);
            maxInt--;
            System.out.println("maxInt-- = " + maxInt);
            System.out.println("Вывод типа Long: \nmaxLong = " + maxLong);
            maxLong++;
            System.out.println("maxLong++ = " + maxLong);
            maxLong--;
            System.out.println("maxLong-- = " + maxLong);

        System.out.println("\n#5. Перестановка значений переменных");
            int num1 = 2;
            int num2 = 5;
                System.out.println("Исходные значения: \num1 = " + num1 + "\num2 = " + num2);
                System.out.println("Перестановка с помощью третьей переменной:");
                int tmp = num1;
                num1 = num2;
                num2 = tmp;
                System.out.println("Новые значения: \num1 = " + num1 + "\num2 = " + num2);
            System.out.println("Перестановка с помощью арифметической операции:");
                num1 = num2 - num1;
                num2 -= num1;
                num1 += num2;
                System.out.println("Новые значения: \num1 = " + num1 + "\num2 = " + num2);
            System.out.println("Перестановка с помощью побитовой операции ^:");
                num1 ^= num2;
                num2 ^= num1;
                num1 ^= num2;
                System.out.println("Новые значения: \num1 = " + num1 + "\num2 = " + num2);

            System.out.println("\n#6. Вывод символов и их кодов");
                char char1 = 35;
                char char2 = 38;
                char char3 = 64;
                char char4 = 94;
                char char5 = 95;
                System.out.println("Code ASCII " + (int) char1 + " character ASCII " + char1 + "\nCode ASCII " + (int) char2 + " character ASCII " + char2 +
                                    "\nCode ASCII " + (int) char3 + " character ASCII " + char3 + "\nCode ASCII " + (int) char4 + " character ASCII " + char4 +
                                    "\nCode ASCII " + (int) char5 + " character ASCII " + char5
                );

            System.out.println("\n#7. Вывод в консоль ASCII-арт Дюка");
                char slashRight = '/';
                char slashLeft = '\\';
                char underline = '_';
                char bracketLeft = ')';
                char bracketRight = '(';
                System.out.println("     " + slashRight + "" + slashLeft + "\n    " + slashRight + "  " + slashLeft + "\n   " + slashRight + "" + underline + bracketRight + " " + bracketLeft + 
                    "" + slashLeft + "\n  " + slashRight + "      " + slashLeft + "\n " + slashRight + ""+ underline + "" + underline + "" + underline + "" + underline + "" + slashRight + 
                    "" + slashLeft + "" + underline + "" + underline + "" + slashLeft
                );

            System.out.println("\n#8. Вывод количества сотен, десятков и единиц числа");
                int number = 123;
                int digit1 = number % 10;
                int digit2 = number / 10 % 10;
                int digit3 = number / 100;
                int totalDigits = digit1 + digit2 + digit3;
                int multiplyDigits = digit1 * digit2 * digit3;
                System.out.println("Число " + number + " содержит:\n " + digit3 + " сотен\n " + digit2 + " десятков\n " + digit1 + " единиц");
                System.out.println("Сумма его цифр = " + totalDigits + "\nПроизведение его цифр = " + multiplyDigits);

            System.out.println("\n9. Вывод времени");
                int totalSeconds = 86399;
                int minutes = totalSeconds % 60;
                int hour = totalSeconds / 3600;
                int seconds = totalSeconds % (totalSeconds / 60);
                System.out.println(hour + ":" + minutes + ":" + seconds);

    }
}