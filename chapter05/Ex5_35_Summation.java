import java.util.Scanner;

public class Ex5_35_Summation {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double sum = 0;
    for (int i = 625; i > 0; i--) {
      sum += 1 / (Math.sqrt(i) + Math.sqrt(i + 1));
    }

    System.out.println(sum);
  }
}
