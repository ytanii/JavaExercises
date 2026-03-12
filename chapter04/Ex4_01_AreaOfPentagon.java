import java.util.Scanner;

public class Ex4_01_AreaOfPentagon {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the length from the center to a vertex: ");
    double lengthFromCenter = scanner.nextDouble();

    double sideLength = 2 * lengthFromCenter * Math.sin(Math.PI / 5);

    double area = (5 * Math.pow(sideLength, 2)) / (4 * Math.tan(Math.PI / 5));

    System.out.printf("The are of the pentagon is %.2f", area);
  }
}
