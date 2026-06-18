import java.util.Scanner;

public class Ex3_09_CheckISBN10 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the first 9 digits of the ISBN as an integer: ");
    int first9Digits = scanner.nextInt();
    int d9 = first9Digits % 10;
    first9Digits /= 10;
    int d8 = first9Digits % 10;
    first9Digits /= 10;
    int d7 = first9Digits % 10;
    first9Digits /= 10;
    int d6 = first9Digits % 10;
    first9Digits /= 10;
    int d5 = first9Digits % 10;
    first9Digits /= 10;
    int d4 = first9Digits % 10;
    first9Digits /= 10;
    int d3 = first9Digits % 10;
    first9Digits /= 10;
    int d2 = first9Digits % 10;
    first9Digits /= 10;
    int d1 = first9Digits % 10;

    int d10 =
        ((d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11);

    if (d10 == 10) {
      System.out.println(
          "The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + "X");
    } else {
      System.out.println(
          "The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10);
    }
  }
}
