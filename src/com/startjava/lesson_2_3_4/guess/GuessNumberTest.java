package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать в игру угадай число! У каждого игрока по 10 попыток");
        System.out.println("Первый игрок, введите имя");
        Player player1 = new Player(scanner.nextLine());
        System.out.println("Второй игрок, введите имя");
        Player player2 = new Player(scanner.nextLine());
        System.out.println("Третий игрок, введите имя");
        Player player3 = new Player(scanner.nextLine());
        String option = "да";
        GuessNumber guess = new GuessNumber(player1, player2, player3);
        while(!option.toLowerCase().equals("нет")) {
            if (option.toLowerCase().equals("да")) {
                guess.launch();
            }
            System.out.println("\nВы хотите продолжить игру? (да/нет)");
            option = scanner.nextLine();
        }
    }
}