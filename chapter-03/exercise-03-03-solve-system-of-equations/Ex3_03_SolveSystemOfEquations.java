import java.util.Scanner;

public class Ex3_03_SolveSystemOfEquations {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a, b, c, d, e, f:");
    double a = scanner.nextDouble();
    double b = scanner.nextDouble();
    double c = scanner.nextDouble();
    double d = scanner.nextDouble();
    double e = scanner.nextDouble();
    double f = scanner.nextDouble();

    double denominator = (a * d) - (b * c);

    if (denominator != 0) {
      double xNumerator = (e * d) - (b * f);
      double yNumerator = (a * f) - (e * c);
      double x = xNumerator / denominator;
      double y = yNumerator / denominator;

      System.out.println("x is " + x + " and y is " + y);
    } else {
      System.out.println("The equation has no solution");
    }
  }
}
