import java.util.Scanner;

public class Ex5_22_LoanAmortization {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Loan Amount: ");
    double initialAmount = scanner.nextDouble();

    System.out.print("Number of Years: ");
    int numOfYears = scanner.nextInt();

    System.out.print("Annual Interest Rate: ");
    double annualInterestRate = scanner.nextInt();

    double monthlyPayment =
        (initialAmount * (annualInterestRate / 1200.0))
            / (1 - (1 / (Math.pow(1 + (annualInterestRate / 1200.0), numOfYears * 12))));
    double totalPayment = monthlyPayment * 12 * numOfYears;
    System.out.println();

    System.out.printf("Monthly Payment: %.2f\n", monthlyPayment);
    System.out.printf("Total Payment: %.2f ", totalPayment);
    System.out.println();
    System.out.println();

    double balance = initialAmount;

    System.out.println("Payment#   Interest    Principal    Balance");
    for (int i = 1; i <= numOfYears * 12; i++) {

      double monthlyInterest = balance * (annualInterestRate / 1200.0);
      double principal = monthlyPayment - monthlyInterest;
      balance -= principal;

      System.out.printf("%3d %12.2f %12.2f %12.2f\n", i, monthlyInterest, principal, balance);
    }
  }
}
