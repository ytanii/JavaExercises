import java.util.Scanner;

public class Ex3_07_FinancialApplicationMonetaryUnits {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a double for a dollar amount: ");
    double dollars = scanner.nextDouble();

    int cents = (int) (100 * dollars);

    int currentDollars = cents / 100;
    cents %= 100;

    int currentQuarters = cents / 25;
    cents %= 25;

    int currentDimes = cents / 10;
    cents %= 10;

    int currentNickels = cents / 5;
    cents %= 5;

    int currentPennies = cents;

    boolean isPlural = currentDollars > 1;
    if (currentDollars != 0) {
      System.out.println(currentDollars + (isPlural ? " dollars" : " dollar"));
    }

    isPlural = currentQuarters > 1;
    if (currentQuarters != 0) {
      System.out.println(currentQuarters + (isPlural ? " quarters" : " quarter"));
    }

    isPlural = currentDimes > 1;
    if (currentDimes != 0) {
      System.out.println(currentDimes + (isPlural ? " dimes" : " dime"));
    }

    isPlural = currentNickels > 1;
    if (currentNickels != 0) {
      System.out.println(currentNickels + (isPlural ? " nickels" : " nickel"));
    }

    isPlural = currentPennies > 1;
    if (currentPennies != 0) {
      System.out.println(currentPennies + (isPlural ? " pennies" : " penny"));
    }
  }
}
