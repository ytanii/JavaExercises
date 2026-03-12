import java.util.Scanner;

public class Ex2_13_CompoundValue {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the monthly saving amount: ");
    double monthlySaving = scanner.nextDouble();

    final double MONTHLY_INTEREST_RATE = 0.00417;

    double firstMonth = monthlySaving * (1 + MONTHLY_INTEREST_RATE);
    double secondMonth = (firstMonth + monthlySaving) * (1 + MONTHLY_INTEREST_RATE);
    double thirdMonth = (secondMonth + monthlySaving) * (1 + MONTHLY_INTEREST_RATE);
    double fourthMonth = (thirdMonth + monthlySaving) * (1 + MONTHLY_INTEREST_RATE);
    double fifthMonth = (fourthMonth + monthlySaving) * (1 + MONTHLY_INTEREST_RATE);
    double sixthMonth = (fifthMonth + monthlySaving) * (1 + MONTHLY_INTEREST_RATE);

    System.out.println(
        "After the  sixth month, the account value is $" + ((int) (sixthMonth * 100) / 100.0));
  }
}
