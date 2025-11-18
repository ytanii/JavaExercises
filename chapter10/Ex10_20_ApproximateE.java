import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Scanner;

public class Ex10_20_ApproximateE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 100; i <= 1000; i += 100) {
            BigDecimal number = BigDecimal.ONE;
            for (int j = i; j > 0; j--) {
                number = number.add(BigDecimal.ONE.divide((new BigDecimal(factorial(j))), 25, RoundingMode.HALF_UP));
            }

            System.out.println("i = " + i + "i ----> " + number);

        }
    }
    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
