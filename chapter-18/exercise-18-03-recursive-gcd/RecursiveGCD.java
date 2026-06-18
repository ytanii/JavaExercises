package exercise03;

import java.util.Scanner;

public class RecursiveGCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two integers: ");
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println(gcd(m, n));

    }

    public static int gcd(int m, int n) {
        if (m % n == 0) {
            return n;
        } else {
            return gcd(n, m % n);
        }
    }

}
