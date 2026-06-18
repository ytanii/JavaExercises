package exercise02;

import java.util.Scanner;

public class IterativeFib {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an index: ");
        int n = scanner.nextInt();
        System.out.println(fib(n));


    }

    public static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int f0 = 0;
        int f1 = 1;
        int current_fib = 0;

        for (int i = 1; i < n; i++) {
            current_fib = f0 + f1;
            f0 = f1;
            f1 = current_fib;
        }

        return current_fib;
    }
}