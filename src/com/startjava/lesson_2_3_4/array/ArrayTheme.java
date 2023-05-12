package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArrayTheme {
    public static void main(String[] args) {
        reverseArray();
        elementsMultiply();
        deleteElements();
        reverseAlphabet();
        arrayGeneration();
        copyNonEmptyLines();
    }

    private static void reverseArray() {
        System.out.println("#1. Реверс значений массива.");
        int[] intArray = {4, 2, 1, 3, 7, 6, 5};
        System.out.println("Исходный массив:");
        show(intArray);
        int[] reverseArr = new int[intArray.length];
        System.out.println("\nРеверсивный массив:");
        int index = 0;
        for (int i = intArray.length - 1; i >= 0; i--) {
            reverseArr[index] = intArray[i];
            index++;
        }
        show(reverseArr);
    }

    private static void elementsMultiply() {
        System.out.println("\n\n#2. Вывод произведения элементов массива.");
        int[] intArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int result = 1;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == 0 || intArray[i] == 9) {
                System.out.println("array[" + i + "] = " + intArray[i]);
                continue;
            }
            result *= intArray[i];
            System.out.print((i != intArray.length - 2 ? intArray[i] + "*" : intArray[i] + " = " + result + "\n"));
        }
    }

    private static void deleteElements() {
        System.out.println("\n#3. Удаление элементов массива.");
        System.out.println("Исходный массив:");
        double[] doubleArrar = {0.1, 0.4, 0, 0.2, 0.5, 0.3, 0.6, 0.65, 0.56, 0.64, 0.34, 0.23, 0.45, 0.78, 0.94};
        show(doubleArrar);
        double element = doubleArrar[doubleArrar.length / 2];
        double[] newArray = new double[doubleArrar.length];
        int count = 0;
        for (int i = 0; i < doubleArrar.length; i++) {
            if (doubleArrar[i] > element) {
                newArray[i] = 0;
                count++;
            } else {
                newArray[i] = doubleArrar[i];
            }
        }
        System.out.println("\nИзмененный массив:");
        show(newArray);
        System.out.println("\nКоличество обнуленных ячеек = " + count);
    }

    private static void reverseAlphabet() {
        System.out.println("\n#4. Вывод элементов массива лесенкой в обратном порядке.");
        String[] strArray = new String[26];
        int letter = 65;
        for (int i = 0; i < strArray.length; i++) {
            strArray[i] = String.valueOf((char) letter);
            letter++;
        }
        for (int i = 0; i < strArray.length; i++) {
            for (int j = strArray.length - 1; j >= strArray.length - i - 1; j--) {
                System.out.print(strArray[j]);
            }
            System.out.println();
        }
    }

    private static void arrayGeneration() {
        System.out.println("\n#5. Генерация уникальных чисел.");
        int[] intArray = new int[30];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = 60 + (int) (Math.random() * 40);
            for (int j = 0; j < i;) {
                if (intArray[i] == intArray[j]) {
                    intArray[i] = 60 + (int) (Math.random() * 40);
                    j = 0;
                } else {
                    j++;
                }
            }
        }
        Arrays.sort(intArray);
        for (int i = 0; i < intArray.length; i++) {
            if (i > 0 && i % 10 == 0) {
                System.out.println();
            }
            System.out.printf("%3d", intArray[i]);
        }
    }

    private static void copyNonEmptyLines() {
        System.out.println("\n\n#6. Копирование не пустых строк.");
        String[] strings = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        int size = 0;
        show(strings);
        for (String element : strings) {
            if (!element.isBlank()) {
                size++;
            }
        }
        System.out.println();
        String[] array = new String[size];
        int i = 0;
        for (String element : strings) {
            if (!element.isBlank()) {
                array[i] = element;
                i++;
            }
        }
        show(array);
        System.out.println();
    }

    private static void show(int[] array) {
        for (int element : array) {
            System.out.printf("%2d", element);
        }
    }

    private static void show(double[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == 8) {
                System.out.println();
            }
            System.out.printf("%10.3f", array[i]);
        }
    }

    private static void show(String[] array) {
        for (String element : array) {
            System.out.printf("%s", element);
        }
    }
}