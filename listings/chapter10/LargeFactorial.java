import java.math.BigInteger;
import java.util.Scanner;

public class LargeFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int number = scanner.nextInt();

        System.out.println(number + "! is\n" + factorial(number));
    }

    public static BigInteger factorial(long number) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= number; i++) {
            result = result.multiply(new BigInteger(i + ""));

        }

        return result;
    }
}
