package exercise07;

import java.util.Scanner;

public class FibSeries {
    private static int fib_calls = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an index: ");
        int n = scanner.nextInt();
        System.out.println("fib(" + n + ") = " + fib(n));
        System.out.println("The number of fib calls for index " + n + " is " + fib_calls);
    }

    public static double fib(int n) {
        fib_calls++;
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fib(n - 2) + fib(n - 1);
        }
    }

}
