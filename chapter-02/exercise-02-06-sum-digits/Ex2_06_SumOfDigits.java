import java.util.Scanner;

public class Ex2_06_SumOfDigits {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a number between 0 and 1000: ");
    int number = scanner.nextInt();

    int thirdDigit = number % 10;

    int remainingAmount = number / 10;
    int secondDigit = remainingAmount % 10;

    remainingAmount = remainingAmount / 10;
    int firstDigit = remainingAmount % 10;

    int sumOfTheDigits = firstDigit + secondDigit + thirdDigit;

    System.out.println("The sum of the digits is " + sumOfTheDigits);
  }
}
