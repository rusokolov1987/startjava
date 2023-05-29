package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать в игру угадай число! У каждого игрока по 10 попыток");
        GuessNumber game = new GuessNumber(createPlayer(scanner), createPlayer(scanner), createPlayer(scanner));
        String option = "да";
        while(!option.toLowerCase().equals("нет")) {
            if (option.toLowerCase().equals("да")) {
                game.launch();
            }
            System.out.println("\nВы хотите продолжить игру? (да/нет)");
            option = scanner.nextLine();
        }
    }

    private static Player createPlayer(Scanner scanner) {
        System.out.println("Введите имя игрока:");
        return new Player(scanner.nextLine());
    }
}