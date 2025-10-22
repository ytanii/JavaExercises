import java.util.Scanner;

public class Listing05_09_GreatestCommonDivisor {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int number1 = -1;
    int number2 = -1;

    do {
      System.out.print("Enter two positive numbers separated by a space: ");
      number1 = scanner.nextInt();
      number2 = scanner.nextInt();
    } while (number1 <= 0 || number2 <= 0);

    int i = 1;
    int gcd = 1;

    while (number1 >= i && number2 >= i) {
      gcd = (number1 % i == 0 && number2 % i == 0) ? i : gcd;
      i++;
    }

    System.out.println(number1 + " and " + number2 + " have a greatest common divisor of " + gcd);
  }
}
