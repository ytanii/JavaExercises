import java.util.Scanner;

public class Ex3_32_PointPosition {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter three points for p0, p1, and p2: ");

    double x0 = scanner.nextDouble();
    double y0 = scanner.nextDouble();

    double x1 = scanner.nextDouble();
    double y1 = scanner.nextDouble();

    double x2 = scanner.nextDouble();
    double y2 = scanner.nextDouble();

    double status = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);

    if (status > 0) {
      System.out.println(
          "("
              + x2
              + ", "
              + y2
              + ") is on the left side of the line from ("
              + x0
              + ", "
              + y0
              + ") to ("
              + x1
              + ", "
              + y1
              + ")");
    } else if (status < 0) {
      System.out.println(
          "("
              + x2
              + ", "
              + y2
              + ")"
              + " is on the right side of the line from ("
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
              + ")"
              + " is on the line from ("
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
