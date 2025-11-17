import java.math.BigInteger;
import java.util.Scanner;

public class Ex10_17_SquareNumbers {
    public static void main(String[] args) {

        long root = (long) Math.sqrt(Long.MAX_VALUE) + 1;
        BigInteger n = BigInteger.valueOf(root);

        for (int i = 0; i < 10; i++) {
            BigInteger square = n.multiply(n);
            System.out.println(square.toString());
            n = n.add(BigInteger.ONE);

        }
    }
}
