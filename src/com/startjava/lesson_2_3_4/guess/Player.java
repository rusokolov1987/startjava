package com.startjava.lesson_2_3_4.guess;

public class Player {
    private String name;
    private int number;
    private int[] numbers;
    private int size;

    public Player(String name) {
        this.name = name;
        this.numbers = new int[10];
        this.size = 0;
    }

    public String getName() {
        return name;
    }

    public void addNumber(int element) {
        numbers[size] = element;
        size++;
    }

    public int getNumber(int index) {
        return numbers[index];
    }

    public int getSize() {
        return size;
    }
}