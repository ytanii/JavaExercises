import java.util.Scanner;

public class Ex3_19_PerimeterOfTriangle {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter three side length values for a triangle: ");
    double side1 = scanner.nextDouble();
    double side2 = scanner.nextDouble();
    double side3 = scanner.nextDouble();

    if ((side1 > 0 && side2 > 0 && side3 > 0)
        && ((side1 < (side2 + side3)) && (side2 < (side1 + side3)) && (side3 < (side1 + side2)))) {
      double perimeter = side1 + side2 + side3;
      System.out.println("The perimeter of the triangle is " + perimeter);

    } else {
      System.out.println("Invalid triangle");
    }
  }
}
