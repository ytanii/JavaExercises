import java.util.Scanner;

public class Ex5_36_CheckingISBN {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int d10 = 0;
    System.out.print("Enter the first 9 digits of the ISBN-10 number: ");
    String first9Digits = scanner.nextLine();

    for (int i = 1; i <= 9; i++) {
      d10 += ((first9Digits.charAt(i - 1) - '0') * i);
      if (i == 9) {
        d10 %= 11;
      }
    }

    if (d10 == 10) {
      System.out.println("The ISBN-10 number is " + first9Digits + "X");
    } else {
      System.out.println("The ISBN-10 number is " + first9Digits + "" + d10);
    }
  }
}
