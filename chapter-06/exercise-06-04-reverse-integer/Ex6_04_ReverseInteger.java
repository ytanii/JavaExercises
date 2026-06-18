import java.util.Scanner;

public class Ex6_04_ReverseInteger {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    reverse(scanner.nextInt());
  }

  public static void reverse(int number) {
    int helper = number;
    int reversedNumber = 0;
    while (helper != 0) {
      reversedNumber *= 10;
      reversedNumber += helper % 10;
      helper /= 10;
    }

    System.out.println("The reverse of " + number + " is " + reversedNumber);
  }
}
