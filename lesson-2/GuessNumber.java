import java.util.*;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int number;
    private boolean result;


    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        Random random = new Random();
        number = random.nextInt(100) + 1;
        result = false;
    }

    public boolean getResult() {
        return result;
    }

    public void startGame() {
        if (number == player1.getNumber() || number == player2.getNumber()) {
            if (player1.getNumber() == player2.getNumber()) {
                System.out.println("Игроки " + player1.getName() + " и " +
                        player2.getName() + ", вы победили!");
            } else if (player1.getNumber() == number) {
                System.out.println("Игрок " + player1.getName() + ", вы победили!");
            } else {
                System.out.println("Игрок " + player2.getName() + ", вы победили!");
            }
            result = true;
            return;
        } else {
            result = false;
        }
        if (number > player1.getNumber()) {
            System.out.println("Число загаданное игроком " + player1.getName() +
                    " меньше того, что загадал компьютер");
        } else {
            System.out.println("Число загаданное игроком " + player1.getName() +
                    " больше того, что загадал компьютер");
        }
        if (number > player2.getNumber()) {
            System.out.println("Число загаданное игроком " + player2.getName() +
                    " меньше того, что загадал компьютер");
        } else {
            System.out.println("Число загаданное игроком " + player2.getName() +
                    " больше того, что загадал компьютер");
        }
    }
}