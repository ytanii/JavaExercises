package exercise11;

import java.util.Scanner;

public class SumDigitsInInteger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = scanner.nextInt();
        System.out.println("The sum of the digits of " + n + " is " + sumDigits(n));
    }

    public static int sumDigits(long n) {
        if (n == 0) {
            return 0;
        }
        return (int) n % 10 + sumDigits(n / 10);
    }

}
