import java.util.Scanner;

public class Ex2_10_CalculateEnergy {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the amount of water in kilograms: ");
    double weight = scanner.nextDouble();

    System.out.print("Enter the initial temperature: ");
    double initialTemperature = scanner.nextDouble();

    System.out.print("Enter the final temperature: ");
    double finalTemperature = scanner.nextDouble();

    double energy = weight * (finalTemperature - initialTemperature) * 4184;

    System.out.println("The energy needed is " + energy);
  }
}
