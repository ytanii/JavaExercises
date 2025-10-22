import java.util.Scanner;

public class Ex3_33_CompareCost {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the weight and price for package 1: ");
    double weight1 = scanner.nextDouble();
    double price1 = scanner.nextDouble();
    System.out.print("Enter the weight and price for package 2: ");
    double weight2 = scanner.nextDouble();
    double price2 = scanner.nextDouble();

    if ((weight1 / price1) > (weight2 / price2)) {
      System.out.println("Package 1 has a better price.");
    } else if ((weight2 / price2) > (weight1 / price1)) {
      System.out.println("Package 2 has a better price.");

    } else {
      System.out.println("Two packages have the same price.");
    }
  }
}
