import java.util.*;

public class Guessing {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        int playerNumber = 100;
        while (true) {
            if (randomNumber > playerNumber) {
                System.out.println("число = " + playerNumber + " меньше того, что загадал компьютер");
            } else if (randomNumber < playerNumber) {
                System.out.println("число = " + playerNumber + " больше того, что загадал компьютер");
            } else {
                System.out.println("Вы победили!");
                break;
            }
            playerNumber = (65539 + playerNumber) % 101;
        }
    }
}