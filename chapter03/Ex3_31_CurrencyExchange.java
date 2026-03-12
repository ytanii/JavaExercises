import java.util.Scanner;

public class Ex3_31_CurrencyExchange {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the exchange rate from dollars to RMB: ");
    double exchangeRateUSDTORMB = scanner.nextDouble();

    if (exchangeRateUSDTORMB <= 0) {
      System.out.println("Exchange rate must be positive.");
      return;
    }

    System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
    int conversionChoice = scanner.nextInt();

    if (conversionChoice == 0) {
      System.out.print("Enter the dollar amount: ");
      double dollars = scanner.nextDouble();
      double chineseRMB = dollars * exchangeRateUSDTORMB;
      System.out.println("$" + dollars + " is " + (int) (chineseRMB * 100) / 100.0 + " yuan");

    } else if (conversionChoice == 1) {
      double exchangeRateRMBTOUSD = 1 / exchangeRateUSDTORMB;
      System.out.print("Enter the RMB amount: ");
      double chineseRMB = scanner.nextDouble();
      double dollars = chineseRMB * exchangeRateRMBTOUSD;
      System.out.println(chineseRMB + " yuan is $" + (int) (dollars * 100 + 0.5) / 100.0);

    } else {
      System.out.println("Incorrect input");
    }
  }
}
