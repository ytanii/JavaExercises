import java.math.BigInteger;
import java.util.Scanner;

public class Ex10_19_MersennePrimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("p     2^p-1");
        System.out.println("------------");


        for (int p = 2; p <= 100; p++) {
            BigInteger number = BigInteger.TWO.pow(p).subtract(BigInteger.ONE);
            if (isPrime(number)) {
                System.out.println(p + "      " + number);
            }
            
        }
    }

    public static boolean isPrime(BigInteger number) {
        return number.isProbablePrime(20);
    }
}
