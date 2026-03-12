import java.util.Scanner;

public class Ex2_09_CalculateAcceleration {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter v0, v1, and t: ");
    double v0 = scanner.nextDouble();
    double v1 = scanner.nextDouble();
    double t = scanner.nextDouble();

    double averageAcceleration = (v1 - v0) / t;

    System.out.println(
        "The average acceleration is " + (int) (averageAcceleration * 10000 + 0.5) / 10000.0);
  }
}
