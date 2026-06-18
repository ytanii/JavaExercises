import java.math.BigInteger;
import java.util.Scanner;

public class Ex10_16_Divisible2or3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger i = new BigInteger("10000000000000000000000000000000000000000000000000");
        int count = 0;
        while (count != 10) {
            if (i.mod(BigInteger.TWO).compareTo(BigInteger.ZERO) == 0 || i.mod(new BigInteger("3")).compareTo(BigInteger.ZERO) == 0) {
                System.out.println(i);
                count++;
            }
            i = i.add(BigInteger.ONE);
        }

    }
}
