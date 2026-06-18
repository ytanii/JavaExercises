import java.util.Scanner;

public class Ex6_01_PentagonalNumber {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    for (int i = 1; i <= 100; i++) {

      System.out.printf("%7d", getPentagonalNumber(i));

      if (i % 10 == 0) {
        System.out.println();
      }
    }
  }

  public static int getPentagonalNumber(int number) {
    return number * ((3 * number) - 1) / 2;
  }
}
