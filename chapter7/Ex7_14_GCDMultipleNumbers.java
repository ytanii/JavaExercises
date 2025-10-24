import java.util.Scanner;

public class Ex7_14_GCDMultipleNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.print("Enter 5 numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("The gcd of these numbers is " + gcd(numbers));


    }

    public static int gcd(int... numbers) {
        int gcd = 1;
        int minimum = min(numbers);
        for (int divisor = minimum; divisor >= 1; divisor--) {
            int count = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % divisor == 0) {
                    count++;

                }

            }
            if (count == 5) {
                gcd = divisor;
                break;
            }
        }
        return gcd;

    }

    public static int min(int[] numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        return min;
    }
}
