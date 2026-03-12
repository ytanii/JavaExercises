import java.util.Scanner;

public class Ex5_20_DisplayPrime2To1000 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    for (int number = 2, count = 0; number <= 1000; number++) {
      boolean isPrime = true;

      for (int divisor = 2; divisor <= Math.sqrt(number); divisor++) {
        if (number % divisor == 0) {
          isPrime = false;
        }
      }

      if (isPrime) {
        System.out.printf("%4d", number);
        count++;
        if (count % 8 == 0) {
          System.out.println();
        }
      }
    }
  }
}
