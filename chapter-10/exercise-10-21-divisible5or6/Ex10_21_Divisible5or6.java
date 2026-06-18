import java.math.BigInteger;
import java.util.Scanner;

public class Ex10_21_Divisible5or6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger i = new BigInteger(String.valueOf(Long.MAX_VALUE));
        int count = 0;
        while (count != 10) {
            if (i.mod(new BigInteger("5")).compareTo(BigInteger.ZERO) == 0 || i.mod(new BigInteger("6")).compareTo(BigInteger.ZERO) == 0) {
                System.out.println(i);
                count++;
            }
            i = i.add(BigInteger.ONE);
        }

    }
}
