import java.util.Scanner;

public class Ex3_27_PointsInATriangle {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a point's x- and y-coordinates: ");
    double x = scanner.nextDouble();
    double y = scanner.nextDouble();

    double slope = -0.5;

    double yValue = (slope * x) + 100.0;

    if ((y < yValue && y > 0) && (x > 0 && x < 200)) {
      System.out.println("The point is in the triangle");
    } else {
      System.out.println("The point is not in the triangle");
    }
  }
}
