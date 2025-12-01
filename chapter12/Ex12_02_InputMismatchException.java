import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex12_02_InputMismatchException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int operand1;
        int operand2;
        boolean cont = true;

        while (cont) {
            try {
                System.out.print("Enter two integers: ");
                operand1 = scanner.nextInt();
                operand2 = scanner.nextInt();
                cont = false;
                int sum = sum(operand1, operand2);
                System.out.println(operand1 + " + " + operand2 + " = " + sum);


            } catch (InputMismatchException ex) {
                System.out.println("Wrong Input");
                scanner.nextLine();
            }

        }

    }

    public static int sum(int operand1, int operand2) {
        return operand1 + operand2;
    }
}
