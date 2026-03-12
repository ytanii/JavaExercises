import java.util.Scanner;

public class Ex3_25_IntersectingAPoint {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
    double x1 = scanner.nextDouble();
    double y1 = scanner.nextDouble();

    double x2 = scanner.nextDouble();
    double y2 = scanner.nextDouble();

    double x3 = scanner.nextDouble();
    double y3 = scanner.nextDouble();

    double x4 = scanner.nextDouble();
    double y4 = scanner.nextDouble();

    double a = y1 - y2;
    double b = -(x1 - x2);
    double c = (y1 - y2) * x1 - (x1 - x2) * y1;

    double d = y3 - y4;
    double e = -(x3 - x4);
    double f = (y3 - y4) * x3 - (x3 - x4) * y3;

    if (a * e - b * d == 0) {
      System.out.println("The two lines are parallel");
    } else {
      double x = (c * e - b * f) / (a * e - b * d);
      double y = (a * f - c * d) / (a * e - b * d);
      System.out.printf("The intersecting point is at (%.5f, %.5f)\n", x, y);
    }
  }
}
