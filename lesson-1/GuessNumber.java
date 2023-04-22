import java.util.*;

public class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        int playerNumber = 1;
        while (true) {
            if (randomNumber == playerNumber) {
                System.out.println("Вы победили!");
                break;
            }
            if (randomNumber > playerNumber) {
                System.out.println("число = " + playerNumber + " меньше того, что загадал компьютер");
            } else {
                System.out.println("число = " + playerNumber + " больше того, что загадал компьютер");
            }
            playerNumber = (playerNumber + playerNumber) % 101;
        }
    }
}