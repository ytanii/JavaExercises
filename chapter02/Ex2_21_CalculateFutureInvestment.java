import java.util.Scanner;

public class Ex2_21_CalculateFutureInvestment {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter investment amount: ");
    double initialBalance = scanner.nextDouble();

    System.out.print("Enter annual interest rate in percentage: ");
    double annualInterestRate = scanner.nextDouble();

    System.out.print("Enter number of years: ");
    int years = scanner.nextInt();

    double monthlyInterestRate = annualInterestRate / 1200;
    double newBalance = initialBalance * Math.pow(1 + monthlyInterestRate, years * 12);

    System.out.println("Future value is $" + (int) (newBalance * 100) / 100.0);
  }
}
