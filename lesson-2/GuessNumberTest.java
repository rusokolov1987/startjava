import java.util.*;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать в игру угадай число!");
        System.out.println("Первый игрок, введите имя");
        Player player1 = new Player(scanner.nextLine());
        System.out.println("Второй игрок, введите имя");
        Player player2 = new Player(scanner.nextLine());
        GuessNumber guess = new GuessNumber(player1, player2);
        while(!player1.getQuestion().toLowerCase().equals("нет") || !player2.getQuestion().toLowerCase().equals("нет")) {
            if (player1.getQuestion().toLowerCase().equals("да") && player2.getQuestion().toLowerCase().equals("да") && !guess.getResult()) {
                System.out.println(player1.getName() + " введите число");
                player1.setNumber(scanner.nextInt());
                System.out.println(player2.getName() + " введите число");
                player2.setNumber(scanner.nextInt());
                guess.startGame();
            }
            if (guess.getResult()) {
                System.out.println("Игрок " + player1.getName() + ", вы хотите продолжить игру? (да/нет)");
                player1.setQuestion(scanner.nextLine());
                scanner.nextLine();
                System.out.println("Игрок " + player2.getName() + ", вы хотите продолжить игру? (да/нет)");
                player2.setQuestion(scanner.nextLine());
                if (player1.getQuestion().toLowerCase().equals("да") && player2.getQuestion().toLowerCase().equals("да")) {
                    guess = new GuessNumber(player1, player2);
                }
            }
        }
    }
}