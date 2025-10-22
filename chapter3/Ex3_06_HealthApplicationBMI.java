import java.util.Scanner;

public class Ex3_06_HealthApplicationBMI {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter weight in pounds: ");
    double weight = scanner.nextDouble();

    System.out.print("Enter feet: ");
    int feet = scanner.nextInt();

    System.out.print("Enter inches: ");
    int inches = scanner.nextInt();

    double POUND_TO_KILOGRAM = 0.45359237;
    double INCHES_TO_METERS = 0.0254;
    inches += feet * 12;

    weight *= POUND_TO_KILOGRAM;
    double meters = inches * INCHES_TO_METERS;

    double bmi = weight / Math.pow(meters, 2);
    String bmiRange = "";

    if (bmi > 30) {
      bmiRange = "Obese";
    } else if (bmi > 25) {
      bmiRange = "Overweight";
    } else if (bmi > 18.5) {
      bmiRange = "Normal";
    } else {
      bmiRange = "Underweight";
    }

    System.out.println("BMI is " + bmi);
    System.out.println(bmiRange);
  }
}
