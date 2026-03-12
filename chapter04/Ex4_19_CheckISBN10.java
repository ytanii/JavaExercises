import java.util.Scanner;

public class Ex4_19_CheckISBN10 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the first 9 digits of an ISBN as integer: ");
    String first9Integers = scanner.nextLine();

    if (first9Integers.length() != 9) {
      System.out.println("Enter a valid ISBN");
      System.exit(1);
    }

    int d1 = Integer.parseInt(first9Integers.charAt(0) + "");
    int d2 = Integer.parseInt(first9Integers.charAt(1) + "");
    int d3 = Integer.parseInt(first9Integers.charAt(2) + "");
    int d4 = Integer.parseInt(first9Integers.charAt(3) + "");
    int d5 = Integer.parseInt(first9Integers.charAt(4) + "");
    int d6 = Integer.parseInt(first9Integers.charAt(5) + "");
    int d7 = Integer.parseInt(first9Integers.charAt(6) + "");
    int d8 = Integer.parseInt(first9Integers.charAt(7) + "");
    int d9 = Integer.parseInt(first9Integers.charAt(8) + "");

    int d10 = (d1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

    if (d10 == 10) {
      System.out.println("The ISBN-10 number is " + first9Integers + "X");
    } else {
      System.out.println("The ISBN-10 number is " + first9Integers + d10);
    }
  }
}
