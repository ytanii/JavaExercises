import java.util.Scanner;

public class Ex3_22_PointInACircle {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a point with two coordinates: ");
    double x = scanner.nextDouble();
    double y = scanner.nextDouble();

    if (Math.pow(x, 2) + (Math.pow(y, 2)) <= 100) {
      System.out.println("Point (" + x + ", " + y + ") is inside the circle.");

    } else {
      System.out.println("Point (" + x + ", " + y + ") is outside the circle.");
    }
  }
}
