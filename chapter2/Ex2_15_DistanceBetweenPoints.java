import java.util.Scanner;

public class Ex2_15_DistanceBetweenPoints {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter x1 and y1: ");
    double x1 = scanner.nextDouble();
    double y1 = scanner.nextDouble();

    System.out.print("Enter x2 and y2: ");
    double x2 = scanner.nextDouble();
    double y2 = scanner.nextDouble();

    double distance = Math.pow((Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)), 0.5);

    System.out.println("The distance betwen the two points is " + distance);
  }
}
