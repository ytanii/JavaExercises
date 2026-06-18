import java.util.Scanner;

public class Ex3_01_QuadraticEquation {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a, b, c");
    double a = scanner.nextDouble();
    double b = scanner.nextDouble();
    double c = scanner.nextDouble();

    double root1 = (-b + Math.pow(Math.pow(b, 2) - (4 * a * c), 0.5)) / (2 * a);
    double root2 = (-b - Math.pow(Math.pow(b, 2) - (4 * a * c), 0.5)) / (2 * a);

    double discriminant = Math.pow(b, 2) - (4 * a * c);

    if (discriminant > 0) {
      System.out.println("Your equation has two roots " + root1 + " and " + root2);
    } else if (discriminant == 0) {
      System.out.println("Your equation has one root " + root1);

    } else {
      System.out.println("Your equation has no real roots");
    }
  }
}
