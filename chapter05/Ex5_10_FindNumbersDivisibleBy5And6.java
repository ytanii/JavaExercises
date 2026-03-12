import java.util.Scanner;

public class Ex5_10_FindNumbersDivisibleBy5And6 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    for (int i = 100, count = 0; i <= 1000; i++) {
      if (count == 10) {
        count = 0;
        System.out.println();
      }
      if (i % 5 == 0 && i % 6 == 0) {
        System.out.print(i + " ");
        count++;
      }
    }
  }
}
