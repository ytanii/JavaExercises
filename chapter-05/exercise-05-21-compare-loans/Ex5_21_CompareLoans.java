import java.util.Scanner;

public class Ex5_21_CompareLoans {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Loan amount: ");
    double initialAmount = scanner.nextDouble();

    System.out.print("Number of Years: ");
    int numOfYears = scanner.nextInt();

    System.out.println("Interest Rate         Monthly Payment        Total Payment");
    for (double interestRate = 5; interestRate <= 8; interestRate += 0.125) {
      double monthlyPayment =
          (initialAmount * (interestRate / 1200.0))
              / (1 - (1 / (Math.pow(1 + (interestRate / 1200.0), numOfYears * 12))));
      double totalPayment = monthlyPayment * 12 * numOfYears;
      System.out.printf(
          "%.3f%%                %.2f                 %.2f\n",
          interestRate, monthlyPayment, totalPayment);
    }
  }
}
