import java.util.Scanner;

public class Ex5_23_CancellationError {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double sum = 0;
    double sum2 = 0;

    for (int i = 1; i <= 50000; i++) {
      sum += (1.0 / i);
    }
    System.out.println(sum);

    for (int i = 50000; i >= 1; i--) {
      sum2 += (1.0 / i);
    }
    System.out.println(sum2);
  }
}
