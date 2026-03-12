import java.util.Scanner;

public class Ex5_47_CheckISBN13 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int d10 = 0;
    System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
    String firstTwelveDigits = scanner.nextLine();

    if (firstTwelveDigits.length() != 12) {
      System.out.println(firstTwelveDigits + " is an invalid input");
      System.exit(1);
    }

    for (int i = 1; i <= 12; i++) {
      d10 +=
          i % 2 == 0
              ? 3 * (firstTwelveDigits.charAt(i - 1) - '0')
              : firstTwelveDigits.charAt(i - 1) - '0';
    }

    d10 %= 10;
    d10 = 10 - d10;

    if (d10 == 10) {
      System.out.println("The ISBN-13 number is " + firstTwelveDigits + "0");
    } else {
      System.out.println("The ISBN-13 number is " + firstTwelveDigits + d10);
    }
  }
}
