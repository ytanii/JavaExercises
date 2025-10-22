import java.util.Scanner;

public class Ex5_19_DisplayNumbersInPyramid {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    for (int i = 1; i <= 8; i++) {

      for (int n = 0; n < (8 - i) * 4; n++) {
        System.out.print(" ");
      }

      for (int j = 1, count = 0; count < i; j *= 2, count++) {
        System.out.printf("%4d", j);
      }

      for (int j = (int) Math.pow(2, i - 2); j >= 1; j /= 2) {
        System.out.printf("%4d", j);
      }

      System.out.println();
    }
  }
}
