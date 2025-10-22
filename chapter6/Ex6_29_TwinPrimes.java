import java.util.Scanner;

public class Ex6_29_TwinPrimes {
    public static void main(String[] args) {


        for (int i = 2; i <= 1000; i++) {
            if (isPrime(i) && isPrime(i + 2)) {
                System.out.println("(" + i + ", " + (i + 2) + ")");
            }
        }

    }

    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= Math.sqrt(number); divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;

    }
}
