import java.util.Scanner;

public class Ex5_24_SumASeries {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double sum = 0;

    for (int i = 1, j = 3; i <= 97 || j <= 99; i += 2, j += 2) {
      sum = sum + ((double) i / j);
    }
    System.out.println(sum);
  }
}
