import java.util.Scanner;

public class Ex6_31_CreditCardValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a credit card number as an integer: ");
        long creditCardNumber = scanner.nextLong();
        System.out.println(creditCardNumber + (isValid(creditCardNumber) ? " is valid" : " is invalid"));


    }

    public static boolean isValid(long number) {
        return ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0 && prefixMatched(number)) && getSize(number) >= 13 && getSize(number) <= 16;

    }

    public static int sumOfDoubleEvenPlace(long number) {
        int count = 0;
        long sumOfDoubleEven = 0;
        while (number > 0) {
            count++;
            if (count % 2 == 0) {
                long x = (number % 10) * 2;
                if (x > 9) {
                    x = (x % 10) + x / 10;
                }
                sumOfDoubleEven += x;
            }
            number /= 10;

        }

        return (int) sumOfDoubleEven;

    }

    public static int sumOfOddPlace(long number) {

        int count = 0;
        long sumOfOdd = 0;
        while (number > 0) {
            count++;
            if (count % 2 != 0) {
                long x = (number % 10);
                sumOfOdd += x;
            }
            number /= 10;
        }

        return (int) sumOfOdd;
    }

    public static boolean prefixMatched(long number) {
        return getPrefix(number, 1) == 4 || getPrefix(number, 1) == 5 || getPrefix(number, 1) == 6 || getPrefix(number, 2) == 37;
    }

    public static int getSize(long d) {
        int count = 0;
        while (d > 0) {
            count++;
            d /= 10;
        }
        return count;

    }

    public static long getPrefix(long number, int k) {
        int size = getSize(number);
        if (size > k) {
            for (int i = 0; i < size - k; i++) {
                number /= 10;
            }
        }
        return number;

    }
}
