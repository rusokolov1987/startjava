public class Calculator {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 2;
        char sign = '*';
        switch (sign) {
            case '+':
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case '-':
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case '/':
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                break;
            case '*':
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case '%':
                System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
                break;
            case '^':
                int multiply = 1;
                for (int i = 0; i < num2; i++) {
                    multiply *= num1;
                }
                System.out.println(num1 + " ^ " + num2 + " = " + multiply);
                break;
            default:
                System.out.println("Такой операции нет!");
                break;
        }
    }
}