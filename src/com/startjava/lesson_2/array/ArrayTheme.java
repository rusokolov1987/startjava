package com.startjava.lesson_2.array;
import java.util.Arrays;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("#1. Реверс значений массива.");
        int[] array1 = {4, 2, 1, 3, 7, 6, 5};
        reverseArray(array1);

        System.out.println("\n\n#2. Вывод произведения элементов массива.");
        int[] array2 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        elementsMultiply(array2);

        System.out.println("\n#3. Удаление элементов массива.");
        double[] array3 = {0.1, 0.4, 0, 0.2, 0.5, 0.3, 0.6, 0.65, 0.56, 0.64, 0.34, 0.23, 0.45, 0.78, 0.94};
        deleteElements(array3);

        System.out.println("\n#4. Вывод элементов массива лесенкой в обратном порядке.");
        reverseAlphabet();

        System.out.println("\n#5. Генерация уникальных чисел.");
        arrayGeneration();

        System.out.println("\n#6. Копирование не пустых строк.");
        String[] strings = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        copyNonEmptyLines(strings);
        System.out.println();
    }

    public static void reverseArray(int[] array) {
        System.out.println("Исходный массив:");
        showIntegerArray(array);
        int[] reverse = new int[array.length];
        System.out.println("\nРеверсивный массив:");
        int index = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            reverse[index] = array[i];
            index++;
        }
        showIntegerArray(reverse);
    }

    public static void elementsMultiply(int[] array) {
        int result = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0 || array[i] == 9) {
                System.out.println("array[" + i + "] = " + array[i]);
                continue;
            }
            result *= array[i];
            System.out.print((i != array.length - 2 ? array[i] + "*" : array[i] + " = " + result + "\n"));
        }
    }

    public static void deleteElements(double[] array) {
        System.out.println("Исходный массив:");
        showDoubleArray(array);
        double element = array[array.length / 2];
        double[] newArray = new double[array.length];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > element) {
                newArray[i] = 0;
                count++;
            } else {
                newArray[i] = array[i];
            }
        }
        System.out.println("\nИзмененный массив:");
        showDoubleArray(newArray);
        System.out.println("\nКоличество обнуленных ячеек = " + count);
    }

    public static void reverseAlphabet() {
        String[] array = new String[26];
        int letter = 65;
        for (int i = 0; i < array.length; i++) {
            array[i] = String.valueOf((char) letter);
            letter++;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j >= array.length - i - 1; j--) {
                System.out.print(array[j]);
            }
            System.out.println();
        }
    }

    public static void arrayGeneration() {
        int[] array = new int[30];
        for (int i = 0; i < array.length; i++) {
            array[i] = 60 + (int) (Math.random() * 40);
            for (int j = 0; j < i;) {
                if (array[i] == array[j]) {
                    array[i] = 60 + (int) (Math.random() * 40);
                    j = 0;
                } else {
                    j++;
                }
            }
        }
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            if (i % 10 == 0) {
                System.out.println();
            }
            System.out.printf("%3d", array[i]);
        }
    }

    public static void copyNonEmptyLines(String[] strings) {
        int size = 0;
        showStringArray(strings);
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
        showStringArray(array);
    }

    private static void showIntegerArray(int[] array) {
        for (Integer element : array) {
            System.out.printf("%2d", element);
        }
    }

    private static void showDoubleArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == 8) {
                System.out.println();
            }
            System.out.printf("%10.3f", array[i]);
        }
    }

    private static void showStringArray(String[] array) {
        for (String element : array) {
            System.out.printf("%s", element);
        }
    }
}