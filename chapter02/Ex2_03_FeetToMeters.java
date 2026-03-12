import java.util.Scanner;

public class Ex2_03_FeetToMeters {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a value for feet: ");
    double feet = scanner.nextDouble();

    double meters = feet * 0.305;

    System.out.println(feet + " feet is " + (int) (meters * 10000.0) / 10000.0 + " meters");
  }
}
