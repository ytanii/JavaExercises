import java.util.Scanner;

public class Ex4_07_CornerPointCoordinates {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the radius of the bounding circle: ");
    double radius = scanner.nextDouble();

    double x1 = radius * Math.cos(Math.PI / 2);
    double y1 = radius * Math.sin(Math.PI / 2);

    double x2 = radius * Math.cos(Math.PI / 2 + 2 * Math.PI / 5);
    double y2 = radius * Math.sin(Math.PI / 2 + 2 * Math.PI / 5);

    double x3 = radius * Math.cos(Math.PI / 2 + 2 * 2 * Math.PI / 5);
    double y3 = radius * Math.sin(Math.PI / 2 + 2 * 2 * Math.PI / 5);

    double x4 = radius * Math.cos(Math.PI / 2 + 3 * 2 * Math.PI / 5);
    double y4 = radius * Math.sin(Math.PI / 2 + 3 * 2 * Math.PI / 5);

    double x5 = radius * Math.cos(Math.PI / 2 + 4 * 2 * Math.PI / 5);
    double y5 = radius * Math.sin(Math.PI / 2 + 4 * 2 * Math.PI / 5);

    System.out.println("The coordinates of the five points on the pentagon are");
    System.out.printf("(%.2f, %.2f)\n", x5, y5);
    System.out.printf("(%.2f, %.2f)\n", x1, y1);
    System.out.printf("(%.2f, %.2f)\n", x2, y2);
    System.out.printf("(%.2f, %.2f)\n", x3, y3);
    System.out.printf("(%.2f, %.2f)\n", x4, y4);
  }
}
