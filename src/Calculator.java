import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operand1 = scanner.nextInt();
        char operation = scanner.next().charAt(0);
        int operand2 = scanner.nextInt();
        reshenie(operand1, operation, operand2);
    }
    public static  int reshenie(int operand1, char operation, int operand2) {
        int otvet = 0;
        if (operation == '+') {
            otvet = operand1 + operand2;
        }
        else if (operation == '-') {
            otvet = operand1 - operand2;
        }
        else if (operation == '*') {
            otvet = operand1 * operand2;
        }
        else if (operation == '/') {
            otvet = operand1 / operand2;
        }
        System.out.println(+ otvet);
        return otvet;
    }
}
