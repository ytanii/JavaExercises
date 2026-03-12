import java.util.Scanner;

public class Ex6_03_PalindromeInteger {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter an integer: ");
    int number = scanner.nextInt();

    System.out.println(
        number + (isPalindrome(number) ? " is a palindrome!" : " is not a palindrome"));
  }

  public static boolean isPalindrome(int number) {
    return number == reverse(number);
  }

  public static int reverse(int number) {
    int reversedNumber = 0;
    while (number != 0) {
      reversedNumber *= 10;
      reversedNumber += number % 10;
      number /= 10;
    }
    return reversedNumber;
  }
}
