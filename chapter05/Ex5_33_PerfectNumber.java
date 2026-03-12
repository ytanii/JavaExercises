import java.util.Scanner;

public class Ex5_33_PerfectNumber {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double sum = 0;

    for (int i = 1; i <= 10000; i++) {
      sum = 0;

      for (int n = 1; n < i; n++) {
        if (i % n == 0) {
          sum += n;
        }
      }
      if (sum == i) {
        System.out.println(i);
      }
    }
  }
}
