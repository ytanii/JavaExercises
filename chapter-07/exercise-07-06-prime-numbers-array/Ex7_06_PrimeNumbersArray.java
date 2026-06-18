import java.util.Arrays;
import java.util.Scanner;

public class Ex7_06_PrimeNumbersArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] primes = new int[50];
        primes[0] = 2;
        int k = 0;

        for (int i = 3; primes[49] == 0; i++) {
            boolean isPrime = true;

            for(int j = 0; primes[j] <= Math.sqrt(i); j++) {
                if (i % primes[j] == 0) {
                    isPrime = false;
                    break;

                }
            }

            if(isPrime){
                primes[k+1] = i;
                k++;

            }

        }


        for(int i = 0; i < primes.length; i++){
            System.out.print(primes[i] + " ");
        }
    }
}
