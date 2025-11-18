import java.math.BigInteger;
import java.util.Scanner;

public class Ex10_18_LargePrimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger n = new BigInteger(String.valueOf(Long.MAX_VALUE));
        n = n.add(BigInteger.ONE);
        boolean isPrime = true;
        for(int i = 0; i < 5;){
            isPrime = true;
            BigInteger sqrt = n.sqrt();
            for(BigInteger divisor = BigInteger.TWO; divisor.compareTo(sqrt) <= 0; divisor = divisor.add(BigInteger.ONE)){
                if(n.mod(divisor).equals(BigInteger.ZERO)){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(n);
                i++;
            }
            n = n.add(BigInteger.ONE);
        }

    }
}
