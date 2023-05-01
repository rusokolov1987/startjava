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
        String option = "да";
        while(!option.toLowerCase().equals("нет")) {
            if (option.toLowerCase().equals("да")) {
                guess.launch();
            }
            if (!option.toLowerCase().equals("нет")) {
                System.out.println("Вы хотите продолжить игру? (да/нет)");
                option = scanner.nextLine();
                if (option.toLowerCase().equals("да")){
                    guess = new GuessNumber(player1, player2);
                }
            }
        }
    }
}