import java.util.*;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        boolean checkQuestion = true;
        while (true) {
            if (checkQuestion) {
                System.out.println("Введите первое число");
                int num1 = scanner.nextInt();
                System.out.println("Введите знак математической операции");
                scanner.nextLine();
                String sign = scanner.nextLine();
                System.out.println("Введите второе число");
                int num2 = scanner.nextInt();
                calculator.showCalculationresult(num1, sign.charAt(0), num2);
                scanner.nextLine();
            }
            System.out.println("Вы хотите продолжить вычисления? (да/нет)");
            String question = scanner.nextLine();
            if (question.toLowerCase().equals("нет")) {
                break;
            } else if (question.toLowerCase().equals("да")) {
                checkQuestion = true;
            } else {
                checkQuestion = false;
            }
        }
    }
}