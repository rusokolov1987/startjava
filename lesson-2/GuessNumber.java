import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int guessNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        Random random = new Random();
        guessNumber = random.nextInt(100) + 1;
    }

    public void launch() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(player1.getName() + " введите число");
            player1.setNumber(scanner.nextInt());
            if (checkingNumber(player1)) {
                break;
            }
            System.out.println(player2.getName() + " введите число");
            player2.setNumber(scanner.nextInt());
            if (checkingNumber(player2)) {
                break;
            }
        }
    }

    private boolean checkingNumber(Player player) {
        if (guessNumber == player.getNumber()) {
            System.out.println(player.getName() + ", вы победили");
            return true;
        }
        if (guessNumber > player.getNumber()) {
            System.out.println("Число загаданное игроком " + player.getName() + " меньше того, что" +
                    " загадал компьютер");
        } else {
            System.out.println("Число загаданное игроком " + player.getName() + " больше того, что" +
                    " загадал компьютер");
        }
        return false;
    }
}