package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] numbers;
    private int attempt;
    private int countWin;

    public Player(String name) {
        this.name = name;
        this.numbers = new int[10];
    }

    public String getName() {
        return name;
    }

    public void addNumber(int number) throws RuntimeException {
        if (number > 0 && number <= 100) {
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

    public void setCountWin(int countWins) {
        this.countWin = countWins;
    }

    public int getCountWin() {
        return countWin;
    }

    public void clear() {
        Arrays.fill(numbers, 0, attempt, 0);
        attempt = 0;
    }
}