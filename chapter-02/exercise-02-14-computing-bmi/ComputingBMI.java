import java.util.Scanner;

public class ComputingBMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double POUND_TO_KILOGRAM_FACTOR = 0.45359237;
        final double INCH_TO_METER_FACTOR = 0.0254;

        System.out.print("Enter weight in pounds: ");
        double pounds = scanner.nextDouble();
        System.out.print("Enter height in inches: ");
        double inches = scanner.nextDouble();

        double kilograms = pounds * POUND_TO_KILOGRAM_FACTOR;
        double meters = inches * INCH_TO_METER_FACTOR;

        double bmi = kilograms / Math.pow(meters, 2);


        System.out.printf("BMI is %.4f", bmi);
    }
}
