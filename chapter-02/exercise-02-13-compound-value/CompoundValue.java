import java.util.Scanner;

public class CompoundValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double ANNUAL_INTEREST_RATE = 5;
        final double MONTHLY_INTEREST_RATE = ANNUAL_INTEREST_RATE / 12;

        System.out.print("Enter the monthly saving amount: ");
        double monthlySavingAmount = scanner.nextDouble();

        double accountBalance = (monthlySavingAmount * ((1 - Math.pow(1 + (MONTHLY_INTEREST_RATE / 100), 6)) / (1 - (1 + (MONTHLY_INTEREST_RATE / 100))))) * (1 + MONTHLY_INTEREST_RATE / 100);

        System.out.printf("After the sixth month, the account value is $%.2f", accountBalance);
    }
}
