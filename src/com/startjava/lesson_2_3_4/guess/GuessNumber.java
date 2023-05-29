package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player[] players;
    private int guessNumber;
    private static final int COUNT_ROUND = 3;
    private static final int COUNT_ATTEMPT = 10;

    public GuessNumber(Player... player) {
        this.players = player;
    }

    public void launch() {
        gameProgress();
        System.out.println("Результаты игры после " + COUNT_ROUND + "-х раундов:");
        showResultGame(players);
        cleanGame();
    }

    private void gameProgress() {
        Random random = new Random();
        int step = 1;
        while (step <= COUNT_ROUND) {
            System.out.println(step + "-й рануд игры!");
            guessNumber = random.nextInt(100) + 1;
            shufflePlayers(random);
            for (int i = 0; i < COUNT_ATTEMPT; i++) {
                boolean check = false;
                for (Player player : players) {
                    if (isGame(player)) {
                        check = true;
                        break;
                    }
                }
                if (check) {
                    break;
                }
            }
            System.out.println("Результаты (раунд " + step + "-й):");
            showResultRound();
            step++;
            cleanRound();
        }
    }

    private Player[] shufflePlayers(Random random) {
        int length = players.length;
        int border = length;
        for (int i = length - 1; i >= 0; i--) {
            int randomPlayer = random.nextInt(border--);
            Player temp = players[i];
            players[i] = players[randomPlayer];
            players[randomPlayer] = temp;
        }
        return players;
    }

    private boolean isGame(Player player) {
        if (inputNumber(player, new Scanner(System.in))) {
            return isGuessed(player);
        }
        return false;
    }

    private boolean inputNumber(Player player, Scanner scanner) {
        while (player.getAttempt() < COUNT_ATTEMPT) {
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
            player.setCountWin(player.getCountWin() + 1);
            return isWin(player);
        }
        return (guessNumber > player.getNumber()) ? isLittleNumber(player) : isBigNumber(player);
    }

    private boolean isWin(Player player) {
        System.out.println("Игрок с именем " + player.getName() + " угадал число " + guessNumber + " c " +
                player.getAttempt() + " попытки.");
        return true;
    }

    private boolean isLittleNumber(Player player) {
        System.out.println("Число загаданное игроком " + player.getName() + " меньше того, что" +
                " загадал компьютер");
        return false;
    }

    private boolean isBigNumber(Player player) {
        System.out.println("Число загаданное игроком " + player.getName() + " больше того, что" +
                " загадал компьютер");
        return false;
    }

    private void showResultRound() {
        for (Player player : players) {
            int[] partPlayerNumbers = player.getNumbers();
            System.out.println("Результаты игрока " + player.getName() + ":");
            for (int number : partPlayerNumbers) {
                System.out.printf("%5d", number);
            }
            System.out.println();
        }
    }

    private void showResultGame(Player[] players) {
        int length = players.length;
        int swapCount = 0;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (players[j].getCountWin() > players[j + 1].getCountWin()) {
                    Player temp = players[j + 1];
                    players[j + 1] = players[j];
                    players[j] = temp;
                    swapCount++;
                }
            }
        }
        for (Player player : players) {
            System.out.println(player.getName() + " " + player.getCountWin());
        }
        if (swapCount == 0) {
            System.out.println("Победитель не выявлен, т.к. игроки выиграли по разу в каждом раунде!");
            return;
        }
        System.out.println("В игре победил игрок " + players[length - 1].getName() + ", который в " + COUNT_ROUND +
                "-х раундах одержал " + players[length - 1].getCountWin() + " побед!");
    }

    private void cleanRound() {
        for (Player player : players) {
            player.clear();
        }
    }

    private void cleanGame() {
        for (Player player : players) {
            player.setCountWin(0);
            player.clear();
        }
    }
}
