import java.util.Scanner;

public class Ex4_04_AreaOfHexagon {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the side length: ");
    double sideLength = scanner.nextDouble();

    double area = (6 * Math.pow(sideLength, 2)) / (4 * Math.tan(Math.PI / 6));

    System.out.printf("The area of the hexagon is %.2f", area);
  }
}
