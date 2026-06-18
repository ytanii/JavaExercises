import java.util.Scanner;

public class Ex2_20_CalculateInterest {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the balance and interest rate (e.g., 3 for 3%) :");

    double balance = scanner.nextDouble();
    double interestRate = scanner.nextDouble();

    double interest = balance * (interestRate / 1200);

    System.out.println("The interest is " + (int) (interest * 100000 + 0.5) / 100000.0);
  }
}
