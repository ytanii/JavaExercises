import java.util.Scanner;

public class Ex5_26_ApproximateE {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double e = 1;
    double item = 1;

    for (int i = 1; i <= 20; i++) {
      item = item / i;
      e += item;
      System.out.printf("%s%.16f%s%d\n", "The e is ", e, " for i = ", i);
    }
  }
}
