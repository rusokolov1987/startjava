package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player[] players;
    private int guessNumber;

    public GuessNumber(Player...player) {
        this.players = player;
    }

    public void launch() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        guessNumber = random.nextInt(100) + 1;
        playersDraw(players, 3, random);
        do {
            if (inputNumber(players[0], scanner)) {
                if (isGuessed(players[0])) {
                    break;
                }
            }
            if (inputNumber(players[1], scanner)) {
                if (isGuessed(players[1])) {
                    break;
                }
            }
            if (!inputNumber(players[2], scanner)) {
                break;
            }
        } while (!isGuessed(players[2]));
        for (Player player : players) {
            show(player);
        }
        cleanGame(players);
    }

    private Player[] playersDraw(Player[] players, int count, Random random) {
        if (count == 0) {
            return players;
        }
        int length = players.length;
        for (int i = length - 1; i >= 0; i--) {
            int randomPlayer = random.nextInt(count);
            Player temp = players[i];
            players[i] = players[randomPlayer];
            players[randomPlayer] = temp;
        }
        return playersDraw(players, count - 1, random);
    }

    private boolean inputNumber(Player player, Scanner scanner) {
        while (true) {
            try {
                if (player.getAttempt() <= 9) {
                    System.out.println(player.getName() + " введите число");
                    player.addNumber(scanner.nextInt());
                    return true;
                }
                System.out.println("У игрока " + player.getName() + " закончились попытки!");
                return false;
            } catch (Exception e) {
                System.out.println(e.getMessage() + "! Введите число из полуинтервала (0, 100]!");
            }
        }
    }

    private boolean isGuessed(Player player) {
        return (guessNumber == player.getNumber()) ? isWin(player) : (guessNumber > player.getNumber()) ?
                isLittleNumber(player) : isBigNumber(player);
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

    private void show(Player player) {
        int[] partPlayerNumbers = player.getNumbers();
        System.out.println("Результаты игрока " + player.getName() + ":");
        for (int number : partPlayerNumbers) {
            System.out.printf("%5d", number);
        }
        System.out.println();
    }

    private void cleanGame(Player[] players) {
        for (Player player : players) {
            player.clear();
        }
    }
}
