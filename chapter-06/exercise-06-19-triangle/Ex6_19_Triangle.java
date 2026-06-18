import java.util.Scanner;

public class Ex6_19_Triangle {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the three side lengths of a triangle: ");
    double side1 = scanner.nextDouble();
    double side2 = scanner.nextDouble();
    double side3 = scanner.nextDouble();

    System.out.println(
        isValid(side1, side2, side3)
            ? "The area of the triangle is " + area(side1, side2, side3)
            : "Invalid Triangle");
  }

  public static boolean isValid(double side1, double side2, double side3) {
    if ((side1 + side2) < side3) {
      return false;
    }
    if ((side2 + side3) < side1) {
      return false;
    }

    if ((side1 + side3) < side2) {
      return false;
    }
    return true;
  }

  public static double area(double side1, double side2, double side3) {
    double semiperimeter = (side1 + side2 + side3) / 2;
    return Math.sqrt(
        semiperimeter
            * (semiperimeter - side1)
            * (semiperimeter - side2)
            * (semiperimeter - side3));
  }
}
