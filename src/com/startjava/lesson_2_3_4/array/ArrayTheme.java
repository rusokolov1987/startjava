package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArrayTheme {
    public static void main(String[] args) {
        reverseArray();
        multiplayElement();
        deleteElements();
        reverseAlphabet();
        generateArrayElement();
        copyNonEmptyLines();
    }

    private static void reverseArray() {
        System.out.println("#1. Реверс значений массива.");
        int[] intArray = {4, 2, 1, 3, 7, 6, 5};
        System.out.println("Исходный массив:");
        show(intArray, 0);
        System.out.println("\nРеверсивный массив:");
        int length = intArray.length;
        show(intArray, length);
    }

    private static void multiplayElement() {
        System.out.println("\n\n#2. Вывод произведения элементов массива.");
        int[] digitArray = new int[10];
        int length = digitArray.length;
        for (int i = 0; i < length; i++) {
            digitArray[i] = i;
        }
        int result = 1;
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (digitArray[i] > 0 && digitArray[i] < 9) {
                result *= digitArray[i];
                System.out.print(digitArray[i]);
                System.out.print((i != length - 2 ? " * " : " = " + result + "\n"));
            } else {
                index = (digitArray[i] == 0) ? i : 0;
                if (digitArray[i] == 9) {
                    System.out.println("0 = digitArray[" + index + "]\n9 = digitArray[" + i + "]");
                }
            }
        }
    }

    private static void deleteElements() {
        System.out.println("\n#3. Удаление элементов массива.");
        System.out.println("Исходный массив:");
        double[] doubleArray = new double[15];
        int length = doubleArray.length;
        for (int i = 0; i < length; i++) {
            doubleArray[i] = Math.random();
        }
        show(doubleArray);
        double midleArrayElement = doubleArray[length / 2];
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (doubleArray[i] > midleArrayElement) {
                doubleArray[i] = 0;
                count++;
            }
        }
        System.out.println("\nИзмененный массив:");
        show(doubleArray);
        System.out.println("\nКоличество обнуленных ячеек = " + count);
    }

    private static void reverseAlphabet() {
        System.out.println("\n#4. Вывод элементов массива лесенкой в обратном порядке.");
        String[] strArray = new String[26];
        int letter = 65;
        int length = strArray.length;
        for (int i = 0; i < length; i++) {
            strArray[i] = String.valueOf((char) letter);
            letter++;
        }
        for (int i = 0; i < length; i++) {
            for (int j = length - 1; j >= length - i - 1; j--) {
                System.out.print(strArray[j]);
            }
            System.out.println();
        }
    }

    private static void generateArrayElement() {
        System.out.println("\n#5. Генерация уникальных чисел.");
        int[] intArray = new int[30];
        int length = intArray.length;
        for (int i = 0; i < length; i++) {
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
        for (int i = 0; i < length; i++) {
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

    private static void show(int[] array, int start) {
        if (start > 0) {
            for (int i = start - 1; i >= 0; i--) {
                System.out.printf("%2d", array[i]);
            }   
        } else {
            for (int element : array) {
                System.out.printf("%2d", element);
            }
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
            System.out.printf("%s%s", element);
        }
    }
}