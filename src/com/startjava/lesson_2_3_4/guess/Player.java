package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private static final int NUMBERS_SIZE = 10;
    private static final int LOW_NUMBER_LIMIT = 0;
    private static final int HIGH_NUMBER_LIMIT = 100;
    private String name;
    private int[] numbers;
    private int attempt;
    private int score;

    public Player(String name) {
        this.name = name;
        this.numbers = new int[NUMBERS_SIZE];
    }

    public String getName() {
        return name;
    }

    public void addNumber(int number) {
        if (number > LOW_NUMBER_LIMIT && number <= HIGH_NUMBER_LIMIT) {
            numbers[attempt] = number;
            attempt++;
            return;
        }
        throw new RuntimeException("Вы ввели число не входящее в полуинтервал (0, 100]");
    }

    public int getNumber() {
        return numbers[attempt - 1];
    }

    public int getAttempt() {
        return attempt;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, attempt);
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void clear() {
        Arrays.fill(numbers, 0, attempt, 0);
        attempt = 0;
    }
}