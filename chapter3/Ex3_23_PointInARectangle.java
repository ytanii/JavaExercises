import java.util.Scanner;

public class Ex3_23_PointInARectangle {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a point with two coordinates: ");
    double x = scanner.nextDouble();
    double y = scanner.nextDouble();

    boolean xIn = false;
    boolean yIn = false;

    if (x <= 5 && x >= -5) {
      xIn = true;
    }

    if (y <= 2.5 && y >= -2.5) {
      yIn = true;
    }

    if (xIn && yIn) {
      System.out.println("Point (" + x + ", " + y + ") is inside the rectangle.");
    } else {
      System.out.println("Point (" + x + ", " + y + ") is outside the rectangle.");
    }
  }
}
