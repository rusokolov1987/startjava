package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private static final int ROUNDS_LIMIT = 3;
    private static final int ATTEMPTS_LIMIT = 10;
    private static final int RANDOM_RANGE = 100;
    private static final int REGULATOR_LIMIT = 1;
    private Player[] players;
    private int guessNumber;

    public GuessNumber(Player... player) {
        this.players = player;
    }

    public void launch() {
        startGamePlay();
        System.out.println("Результаты игры после " + ROUNDS_LIMIT + "-х раундов:");
        showGameResult();
        cleanGame();
    }

    private void startGamePlay() {
        Random random = new Random();
        int step = 1;
        while (step <= ROUNDS_LIMIT) {
            System.out.println(step + "-й рануд игры!");
            guessNumber = random.nextInt(RANDOM_RANGE) + REGULATOR_LIMIT;
            System.out.println("Победителем жеребьевки становится игрок - " + shufflePlayers(random).getName());
            for (int i = 0; i < ATTEMPTS_LIMIT; i++) {
                boolean check = false;
                for (Player player : players) {
                    if (checkInputNumber(player)) {
                        check = true;
                        break;
                    }
                }
                if (check) {
                    break;
                }
            }
            System.out.println("Результаты (раунд " + step + "-й):");
            showRoundResult();
            step++;
            cleanRound();
        }
    }

    private Player shufflePlayers(Random random) {
        int length = players.length;
        for (int i = length - 1; i >= 0; i--) {
            int randomPlayer = random.nextInt(i + 1);
            Player temp = players[i];
            players[i] = players[randomPlayer];
            players[randomPlayer] = temp;
        }
        return players[0];
    }

    private boolean checkInputNumber(Player player) {
        if (inputNumber(player, new Scanner(System.in))) {
            return isGuessed(player);
        }
        return false;
    }

    private boolean inputNumber(Player player, Scanner scanner) {
        while (player.getAttempt() < ATTEMPTS_LIMIT) {
            try {
                System.out.println(player.getName() + " введите число");
                player.addNumber(scanner.nextInt());
                return true;
            } catch (RuntimeException e) {
                System.out.println(e.getMessage() + "! Введите число из полуинтервала (0, 100]!");
            }
        }
        System.out.println("У игрока " + player.getName() + " закончились попытки!");
        return false;
    }

    private boolean isGuessed(Player player) {
        if (guessNumber == player.getNumber()) {
            player.incrementScore();
            System.out.println("Игрок с именем " + player.getName() + " угадал число " + guessNumber + " c " +
                    player.getAttempt() + " попытки.");
            return true;
        }
        System.out.println("Число загаданное игроком "+ player.getName() + ((guessNumber > player.getNumber()) ?
                " меньше" : " больше") + " того, что загадал компьютер!");
        return false;
    }

    private void showRoundResult() {
        for (Player player : players) {
            int[] numbers = player.getNumbers();
            System.out.println("Результаты игрока " + player.getName() + ":");
            for (int number : numbers) {
                System.out.printf("%5d", number);
            }
            System.out.println();
        }
    }

    private void showGameResult() {
        int length = players.length;
        int swapCount = 0;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (players[j].getScore() > players[j + 1].getScore()) {
                    Player temp = players[j + 1];
                    players[j + 1] = players[j];
                    players[j] = temp;
                    swapCount++;
                }
            }
        }
        for (Player player : players) {
            System.out.println(player.getName() + " " + player.getScore());
        }
        if (swapCount == 0) {
            System.out.println("Победитель не выявлен, т.к. игроки выиграли по разу в каждом раунде!");
            return;
        }
        System.out.println("В игре победил игрок " + players[length - 1].getName() + ", который в " + ROUNDS_LIMIT +
                "-х раундах одержал " + players[length - 1].getScore() + " побед!");
    }

    private void cleanRound() {
        for (Player player : players) {
            player.clear();
        }
    }

    private void cleanGame() {
        for (Player player : players) {
            player.cleanScore();
            player.clear();
        }
    }
}
