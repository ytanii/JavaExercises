import java.util.Scanner;

public class Ex4_05_AreaOfRegularPolygon {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the number of sides: ");
    int numberOfSides = scanner.nextInt();

    System.out.print("Enter the side length: ");
    double sideLength = scanner.nextDouble();

    double area =
        (numberOfSides * Math.pow(sideLength, 2)) / (4 * Math.tan(Math.PI / numberOfSides));

    System.out.println("The area of the polygon is " + area);
  }
}
