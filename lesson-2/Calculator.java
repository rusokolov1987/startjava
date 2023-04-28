public class Calculator {
    public void showCalculationresult(int num1, char sign, int num2) {
        int result = 0;
        boolean checkOperator = true;
        switch (sign) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '/':
                if (num2 == 0) {
                    break;
                }
                result = num1 / num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '%':
                if (num2 == 0) {
                    break;
                }
                result = num1 % num2;
                break;
            case '^':
                if (num1 == 1 || num1 == 0) {
                    result = num1;
                    break;
                }
                if (num2 == 0) {
                    result = 1;
                    break;
                }
                int multiply = 1;
                for (int i = 0; i < num2; i++) {
                    multiply *= num1;
                }
                result = multiply;
                break;
            default:
                checkOperator = false;
                System.out.println("Такой операции нет!");
                break;
        }
        if (!checkOperator) {
            return;
        }
        if (sign == '%' | sign == '/' && num2 == 0) {
            System.out.println("Деление на ноль!");
        } else {
            System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
        }
    }
}