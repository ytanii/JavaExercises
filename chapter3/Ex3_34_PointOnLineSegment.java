import java.util.Scanner;

public class Ex3_34_PointOnLineSegment {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter three points for p0, p1, and p2: ");

    double x0 = scanner.nextDouble();
    double y0 = scanner.nextDouble();

    double x1 = scanner.nextDouble();
    double y1 = scanner.nextDouble();

    double x2 = scanner.nextDouble();
    double y2 = scanner.nextDouble();

    double minX = x0 > x1 ? x1 : x0;
    double maxX = x0 > x1 ? x0 : x1;

    double minY = y0 > y1 ? y1 : y0;
    double maxY = y0 > y1 ? y0 : y1;

    final double EPSILON = 1E-14;

    double status = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);

    if (Math.abs(status) < EPSILON && ((x2 >= minX && x2 <= maxX) && (y2 >= minY && y2 <= maxY))) {
      System.out.println(
          "("
              + x2
              + ", "
              + y2
              + ") is on line from ("
              + x0
              + ", "
              + y0
              + ") to ("
              + x1
              + ", "
              + y1
              + ")");

    } else {
      System.out.println(
          "("
              + x2
              + ", "
              + y2
              + ") is not on line from ("
              + x0
              + ", "
              + y0
              + ") to ("
              + x1
              + ", "
              + y1
              + ")");
    }
  }
}
