import java.util.Scanner;

public class Ex2_16_AreaOfHexagon {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the length of the side: ");
    double sideLength = scanner.nextDouble();

    double area = ((3 * Math.pow(3, 0.5)) / 2) * (Math.pow(sideLength, 2));

    System.out.println("The area of the hexagon is " + ((int) (area * 10000) / 10000.0));
  }
}
