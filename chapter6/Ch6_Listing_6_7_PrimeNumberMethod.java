import java.util.Scanner;

public class Ch6_Listing_6_7_PrimeNumberMethod {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    printPrimeNumbers(50);
  }

  public static void printPrimeNumbers(int n) {

    int i = 0;
    int number = 2;
    while (i < n) {

      if (isPrime(number)) {
        System.out.print(number + " ");
        i++;
        if (i % 10 == 0) {
          System.out.println();
        }
      }
      number++;
    }
  }

  public static boolean isPrime(int number) {
    for (int divisor = 2; divisor <= Math.sqrt(number); divisor++) {
      if (number % divisor == 0) {
        return false;
      }
    }
    return true;
  }
}
