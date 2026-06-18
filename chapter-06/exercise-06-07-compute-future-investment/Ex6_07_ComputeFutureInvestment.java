import java.util.Scanner;

public class Ex6_07_ComputeFutureInvestment {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    final int YEAR = 30;
    System.out.print("The amount invested: ");
    double initialAmount = scanner.nextDouble();

    System.out.print("Annual interest rate: ");
    double annualInterestRate = scanner.nextDouble();
    double monthlyInterestRate = annualInterestRate / 1200.0;

    System.out.println("Years  Future Value");
    for (int i = 1; i <= YEAR; i++) {
      System.out.printf(
          "%2d       %.2f\n", i, futureInvestmentValue(initialAmount, monthlyInterestRate, i));
    }
  }

  public static double futureInvestmentValue(
      double investmentAmount, double monthlyInterestRate, int years) {
    return investmentAmount * Math.pow((1 + monthlyInterestRate), years * 12);
  }
}
