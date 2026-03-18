package exercise08;

import java.util.Scanner;

public class PrintDigitInReverse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = scanner.nextInt();
        reverseDisplay(n);

    }

    public static void reverseDisplay(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n % 10);
        reverseDisplay(n / 10);
    }
}
