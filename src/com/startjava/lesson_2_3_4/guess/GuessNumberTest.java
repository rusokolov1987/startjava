package com.startjava.lesson_2_3_4.guess;
import com.startjava.lesson_2_3_4.guess.GuessNumber;
import  com.startjava.lesson_2_3_4.guess.Player;
import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать в игру угадай число!");
        System.out.println("Первый игрок, введите имя");
        Player player1 = new Player(scanner.nextLine());
        System.out.println("Второй игрок, введите имя");
        Player player2 = new Player(scanner.nextLine());
        String option = "да";
        GuessNumber guess = new GuessNumber(player1, player2);
        while(!option.toLowerCase().equals("нет")) {
            if (option.toLowerCase().equals("да")) {
                guess.launch();
            }
            System.out.println("Вы хотите продолжить игру? (да/нет)");
            option = scanner.nextLine();
        }
    }
}