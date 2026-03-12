import java.util.Scanner;

public class Ex6_26_PalindromicPrime {
    public static void main(String[] args) {
        int numberOfNumbers = 0;
        for (int i = 2; numberOfNumbers < 100; i++) {
            if (isPrime(i) && isPalindrome(i)) {
                System.out.printf(i + " ");
                numberOfNumbers++;
                if (numberOfNumbers % 10 == 0) {
                    System.out.println();
                }
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

    public static boolean isPalindrome(int number) {
        int reversedNumber = 0;
        int originalNumber = number;
        while (number > 0) {
            reversedNumber *= 10;
            reversedNumber += number % 10;
            number /= 10;
        }

        return reversedNumber == originalNumber;


    }
}
