package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int guessNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void launch() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        guessNumber = random.nextInt(100) + 1;
        do {
            if (player1.getSize() < 9) {
                requestNumber(player1, scanner);
                if (isGuessed(player1)) {
                    break;
                }
            } else {
                System.out.println("У игрока " + player1.getName() + " закончились попытки!");
            }
            if (player2.getSize() < 9) {
                requestNumber(player2, scanner);
            } else {
                System.out.println("У игрока " + player2.getName() + " закончились попытки!");
            }
            if (player1.getSize() == 10 && player2.getSize() == 10) {
                break;
            }
        } while (!isGuessed(player2));
    }

    private static void requestNumber(Player player, Scanner scanner) {
        System.out.println(player.getName() + " введите число");
        player.addNumber(scanner.nextInt());
    }

    private boolean isGuessed(Player player) {
        if (guessNumber == player.getNumber(player.getSize() - 1)) {
            System.out.println("Игрок с именем " + player.getName() + " угадал число " + guessNumber + " c " +
                    player.getSize() + " попытки.");
            return true;
        } else if (guessNumber > player.getNumber(player.getSize() - 1)) {
            System.out.println("Число загаданное игроком " + player.getName() + " меньше того, что" +
                    " загадал компьютер");
        } else {
            System.out.println("Число загаданное игроком " + player.getName() + " больше того, что" +
                    " загадал компьютер");
        }
        return false;
    }
}
