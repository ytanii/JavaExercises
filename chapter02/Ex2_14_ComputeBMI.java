import java.util.Scanner;

public class Ex2_14_ComputeBMI {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter weight in pounds: ");
    double weight = scanner.nextDouble();

    System.out.print("Enter height in inches: ");
    double height = scanner.nextDouble();

    weight *= 0.45359237;
    height *= 0.0254;

    double bmi = weight / Math.pow(height, 2);

    System.out.println("BMI is " + (int) (bmi * 10000 + 0.5) / 10000.0);
  }
}
