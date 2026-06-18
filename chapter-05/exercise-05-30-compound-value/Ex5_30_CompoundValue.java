import java.util.Scanner;

public class Ex5_30_CompoundValue {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the amount to be saved for each month: ");
    double monthlyDeposit = scanner.nextDouble();

    System.out.print("Enter the annual interest rate: ");
    double annualInterestRate = scanner.nextDouble();
    double monthlyInterestRate = annualInterestRate / 1200;

    System.out.print("Enter the number of months: ");
    int numberOfMonths = scanner.nextInt();

    double currentValue = monthlyDeposit * (1 + monthlyInterestRate);
    for (int i = 1; i < numberOfMonths; i++) {
      currentValue = (currentValue + monthlyDeposit) * (1 + monthlyInterestRate);
    }

    System.out.print("After the " + numberOfMonths + "th month, the account value is ");
    System.out.printf("%.2f\n", currentValue);
  }
}
