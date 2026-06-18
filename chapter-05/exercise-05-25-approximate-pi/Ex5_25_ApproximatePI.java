import java.util.Scanner;

public class Ex5_25_ApproximatePI {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    for (int j = 1; j <= 10; j++) {
      double sum = 0;

      for (int i = 1; i <= 10000 * j; i++) {
        sum = sum + (Math.pow(-1, i + 1) / (2 * i - 1));
      }
      System.out.println(j + ": " + 4.0 * sum);
    }
  }
}
