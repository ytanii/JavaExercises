import java.util.Scanner;

public class Ex3_29_TwoCircles {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter circle1's center x- y-coordiantes, and radius: ");
    double x1 = scanner.nextDouble();
    double y1 = scanner.nextDouble();
    double radius1 = scanner.nextDouble();

    System.out.print("Enter circle2's center x- y-coordiantes, and radius: ");
    double x2 = scanner.nextDouble();
    double y2 = scanner.nextDouble();
    double radius2 = scanner.nextDouble();

    double distanceBetweenCenter = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);

    if (distanceBetweenCenter <= radius1 - radius2) {
      System.out.println("circle2 is inside circle1");
    } else if (distanceBetweenCenter <= radius1 + radius2) {
      System.out.println("circle2 overlaps circle1");
    } else {
      System.out.println("circle2 does not overlap circle1");
    }
  }
}
