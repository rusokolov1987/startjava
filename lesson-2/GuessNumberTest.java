import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать в игру угадай число!");
        System.out.println("Первый игрок, введите имя");
        Player player1 = new Player(scanner.nextLine());
        System.out.println("Второй игрок, введите имя");
        Player player2 = new Player(scanner.nextLine());
        GuessNumber guess = new GuessNumber(player1, player2);
        String question = "да";
        while(!question.toLowerCase().equals("нет")) {
            if (question.toLowerCase().equals("да")) {
                guess.startGame();
            }
            if (guess.getResult() && !question.toLowerCase().equals("нет")) {
                System.out.println("Вы хотите продолжить игру? (да/нет)");
                question = scanner.nextLine();
                if (question.toLowerCase().equals("да")){
                    guess = new GuessNumber(player1, player2);
                }
            }
        }
    }
}