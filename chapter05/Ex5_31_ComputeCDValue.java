import java.util.Scanner;

public class Ex5_31_ComputeCDValue {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter an initial dollar amount: ");
    double initialAmount = scanner.nextDouble();

    System.out.print("Enter an annual  percentage yield: ");
    double annualInterest = scanner.nextDouble();

    System.out.print("Enter the number of months: ");
    int numberOfMonths = scanner.nextInt();

    double monthlyInterestRate = annualInterest / 1200;
    double currentValue = initialAmount;

    System.out.println("Month     CD Value ");
    for (int i = 1; i <= numberOfMonths; i++) {
      currentValue = currentValue + currentValue * monthlyInterestRate;
      System.out.printf("%2d        %2.2f\n", i, currentValue);
    }
  }
}
