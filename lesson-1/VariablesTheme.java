public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("#1. Вывод характеристик компьютера");
        byte quantityCores = 6;
        short memory = 16;
        int ssd = 512;
        long memoryRate = 3200;
        float cpuMaxRate = 4.2f;
        double cpuRate = 2.3;
        boolean bluetoothActive = true;
        char tradeMark = 153;
        System.out.println("Количество ядер CPU: " + quantityCores + "\nОперативная память: " +
                memory + "\nОбъем SSD: " + ssd + "\nЧастота оперативной памяти: " +
                memoryRate + "\n" + "Максимальная частота CPU: " +
                cpuMaxRate + "\nЧастота CPU: " + cpuRate + "\nНаличие Bluetooth: " +
                (bluetoothActive ? "да\n" : "нет\n") + "MSI" +tradeMark
        );

        System.out.println("#2. Расчет стоимости товара со скидкой");
        int priceBook = 200;
        int pricePen = 100;
        int discount = 11;
        int total = priceBook + pricePen;
        int discountSum = total * discount / 100;
        int discountPrice = total - discountSum;
        System.out.println("Общая стоимость товаров без скидки = " + total + 
                "\nОбщая сумма скидки = " + discountSum + 
                "\nОбщая стоимость товара со скидкой = " + discountPrice + "\n"
        );

        System.out.println("#3. Вывод слова JAVA");
        System.out.println("    J    a   v     v   a\n    J   a a   v   v   a a\nJ   J  aaaaa   " + 
                "V V   aaaaa\n JJ   a     a   V   a     a\n"
        );

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
        char numberSign = '#';
        char ampersand = '&';
        char atSign = '@';
        char caretCircumflex = '^';
        char underscore = '_';
        System.out.println("Code ASCII " + (int) numberSign + " character ASCII " + numberSign + 
                "\nCode ASCII " + (int) ampersand + " character ASCII " + ampersand +
                "\nCode ASCII " + (int) atSign + " character ASCII " + atSign + 
                "\nCode ASCII " + (int) caretCircumflex + " character ASCII " + caretCircumflex +
                "\nCode ASCII " + (int) underscore + " character ASCII " + underscore
        );

        System.out.println("\n#7. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backslash = '\\';
        char underline = '_';
        char bracketLeft = '(';
        char bracketRight = ')';
        System.out.println("     " + slash + "" + backslash + "\n    " + slash + "  " + backslash +
                "\n   " + slash + "" + underline + bracketLeft + " " + bracketRight + "" +
                backslash + "\n  " + slash + "      " + backslash + "\n " + slash + ""+ underline +
                "" + underline + "" + underline + "" + underline + "" + slash + "" + backslash + ""
                + underline + "" + underline + "" + backslash
        );

        System.out.println("\n#8. Вывод количества сотен, десятков и единиц числа");
        int number = 123;
        int numberOfUnits = number % 10;
        int numberOfTens = number / 10 % 10;
        int numberOfHundreds = number / 100;
        int digitsSum = numberOfUnits + numberOfTens + numberOfHundreds;
        int multiplyDigits = numberOfUnits * numberOfTens * numberOfHundreds;
        System.out.println("Число " + number + " содержит:\n " + numberOfHundreds + " сотен\n "+
                numberOfTens + " десятков\n " + numberOfUnits + " единиц");
        System.out.println("Сумма его цифр = " + digitsSum + "\nПроизведение его цифр = " + 
                multiplyDigits
        );

        System.out.println("\n9. Вывод времени");
        int totalSeconds = 86399;
        int minutes = totalSeconds % 60;
        int hour = totalSeconds / 3600;
        int seconds = totalSeconds % (totalSeconds / 60);
        System.out.println(hour + ":" + minutes + ":" + seconds);
    }
}