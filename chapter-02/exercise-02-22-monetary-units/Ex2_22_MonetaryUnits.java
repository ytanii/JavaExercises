import java.util.Scanner;

public class Ex2_22_MonetaryUnits {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter an amount in integer, (e.g., 1156 is 11 dollars and 56 cents) :");
    int amount = scanner.nextInt();

    int dollars = amount / 100;
    int cents = amount % 100;

    amount %= 100;

    int numberOfQuarters = amount / 25;
    amount %= 25;

    int numberOfDimes = amount / 10;
    amount = amount % 10;

    // Find the number of nickels in the remaining amount
    int numberOfNickels = amount / 5;
    amount = amount % 5;

    int numberOfPennies = amount;

    System.out.println("Your amount " + dollars + "." + cents + " consists of");
    System.out.println(" " + dollars + " dollars");
    System.out.println(" " + numberOfQuarters + " quarters ");
    System.out.println(" " + numberOfDimes + " dimes");
    System.out.println(" " + numberOfNickels + " nickels");
    System.out.println(" " + numberOfPennies + " pennies");
  }
}
