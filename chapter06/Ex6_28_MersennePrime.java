import java.util.Scanner;

public class Ex6_28_MersennePrime {
    public static void main(String[] args) {

        System.out.println("  p         2^p-1");
        System.out.println("----------------------");
        for(int p = 2; p <= 31; p++){
            if(isPrime(p) && isMersennePrime(p)){
                System.out.printf("%3d    %10d\n",p, ((int)(Math.pow(2,p) - 1)));
            }
        }

    }

    public static boolean isPrime(int number){
        for(int divisor = 2; divisor <= Math.sqrt(number); divisor++){
            if(number % divisor == 0){
                return false;
            }
        }
        return true;
    }

    public static boolean isMersennePrime(int number){
        int x = (int) (Math.pow(2,number) - 1);
        if(isPrime(x)){
            return true;
        }
        return false;
        
    }
}
