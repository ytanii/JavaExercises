import java.util.Scanner;

public class Ex2_12_FindingRunwayLength {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter speed and acceleration: ");
    double speed = scanner.nextDouble();
    double acceleration = scanner.nextDouble();

    double minRunwayLength = Math.pow(speed, 2) / (2 * acceleration);

    System.out.println(
        "The minimum runway length for this airplane is "
            + (int) (minRunwayLength * 1000 + 0.5) / 1000.0);
  }
}
