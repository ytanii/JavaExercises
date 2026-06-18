package exercise01;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String number_string = scanner.nextLine();
        System.out.println(factorial(new BigInteger(number_string)));

    }

    public static BigInteger factorial(BigInteger n) {
        if (n.equals(BigInteger.ONE) || n.equals(BigInteger.ZERO)) {
            return BigInteger.ONE;
        } else {
            return n.multiply(factorial(n.subtract(BigInteger.ONE)));
        }
    }
}
