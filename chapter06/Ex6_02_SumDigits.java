import java.util.Scanner;

public class Ex6_02_SumDigits {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter an integer: ");
    long number = scanner.nextLong();
    System.out.println("The sum of the digits in " + number + " is " + sumDigits(number));
  }

  public static int sumDigits(long number) {
    int sum = 0;
    while (number != 0) {
      sum += number % 10;
      number /= 10;
    }
    return sum;
  }
}
