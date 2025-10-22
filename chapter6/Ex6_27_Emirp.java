import java.util.Scanner;

public class Ex6_27_Emirp {
    public static void main(String[] args) {
        int numberOfNumbers = 0;
        for (int i = 2; numberOfNumbers < 100; i++) {
            if (isEmirp(i)) {
                System.out.print(i + " ");
                numberOfNumbers++;
                if (numberOfNumbers % 10 == 0) {
                    System.out.println();
                }
            }
        }


    }


    public static boolean isEmirp(int number) {
        return (isPrime(number) && isPrime(reverse(number))) && !(number == reverse(number));


    }

    public static int reverse(int number) {
        int reversedNumber = 0;
        while (number > 0) {
            reversedNumber *= 10;
            reversedNumber += number % 10;
            number /= 10;
        }
        return reversedNumber;
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
