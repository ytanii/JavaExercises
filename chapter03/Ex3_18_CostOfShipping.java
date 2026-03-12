import java.util.Scanner;

public class Ex3_18_CostOfShipping {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the weight of the package (in pounds): ");
    double weight = scanner.nextDouble();

    if (weight > 20) {
      System.out.println("The package cannot be shipped.");
    } else if (weight > 10) {
      System.out.println("The shipping cost is $10.5");

    } else if (weight > 3) {
      System.out.println("The shipping cost is $8.5");

    } else if (weight > 1) {
      System.out.println("The shipping cost is $5.5");

    } else if (weight > 0) {
      System.out.println("The shipping cost is $3.5");

    } else {
      System.out.println("Invalid input");
    }
  }
}
