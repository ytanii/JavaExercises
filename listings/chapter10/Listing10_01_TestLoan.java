import java.util.Scanner;

public class Listing10_01_TestLoan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter annual interest rate: ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Enter number of years: ");
        int numberOfYears = scanner.nextInt();

        System.out.print("Enter loan amount: ");
        double loanAmount = scanner.nextDouble();

        Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);

        System.out.printf("The loan was created on %s\n" + "The monthly payment is %.2f\nThe total payment is %.2f\n", loan.getLoanDate().toString(), loan.getMonthlyPayment(), loan.getTotalPayment());
    }
}
