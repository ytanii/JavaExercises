import java.util.Scanner;

public class Ex2_23_CostOfDriving {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the driving distance: ");
    double distance = scanner.nextDouble();

    System.out.print("Enter the miles per gallon: ");
    double milesPerGallon = scanner.nextDouble();

    System.out.print("Enter price per gallon: ");
    double pricePerGallon = scanner.nextDouble();

    double gallons = distance / milesPerGallon;

    double price = gallons * pricePerGallon;

    System.out.println("The cost of driving is $" + (int) (price * 100) / 100.0);
  }
}
