import java.util.Scanner;

public class Ex3_28_TwoRectangles {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter r1’s center x-, y-coordinates, width, and height:");
    double x1 = scanner.nextDouble();
    double y1 = scanner.nextDouble();
    double width1 = scanner.nextDouble();
    double height1 = scanner.nextDouble();

    System.out.println("Enter r2’s center x-, y-coordinates, width, and height:");
    double x2 = scanner.nextDouble();
    double y2 = scanner.nextDouble();
    double width2 = scanner.nextDouble();
    double height2 = scanner.nextDouble();

    double r1_left = x1 - width1 / 2.0;
    double r1_right = x1 + width1 / 2.0;
    double r1_bottom = y1 - height1 / 2.0;
    double r1_top = y1 + height1 / 2.0;

    double r2_left = x2 - width2 / 2.0;
    double r2_right = x2 + width2 / 2.0;
    double r2_bottom = y2 - height2 / 2.0;
    double r2_top = y2 + height2 / 2.0;

    boolean isInside =
        (r2_left >= r1_left)
            && (r2_right <= r1_right)
            && (r2_bottom >= r1_bottom)
            && (r2_top <= r1_top);

    boolean overlaps =
        !(r2_right < r1_left || r2_left > r1_right || r2_top < r1_bottom || r2_bottom > r1_top);

    if (isInside) {
      System.out.println("r2 is inside r1");
    } else if (overlaps) {
      System.out.println("r2 overlaps r1");
    } else {
      System.out.println("r2 does not overlap r1");
    }
  }
}
