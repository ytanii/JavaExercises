import java.util.Scanner;

public class Ex4_26_MonetaryUnits {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a dollar value: ");
    String amount = scanner.nextLine();

    String dollarPart = amount.substring(0, amount.indexOf('.'));

    String centPart = amount.substring(amount.indexOf('.') + 1);

    int dollars = Integer.parseInt(dollarPart);

    int cents = Integer.parseInt(centPart);

    int quarters = cents / 25;
    cents %= 25;

    int dimes = cents / 10;
    cents %= 10;

    int nickels = cents / 5;

    int pennies = (cents % 5);

    if (dollars > 1) {

      System.out.println(dollars + " dollars");

    } else if (dollars == 1) {
      System.out.println(dollars + " dollar");
    }

    if (quarters > 1) {

      System.out.println(quarters + " quarters");

    } else if (quarters == 1) {
      System.out.println(quarters + " quarter");
    }

    if (dimes > 1) {

      System.out.println(dimes + " dimes");

    } else if (dimes == 1) {
      System.out.println(dimes + " dime");
    }

    if (nickels > 1) {

      System.out.println(nickels + " nickels");

    } else if (nickels == 1) {
      System.out.println(nickels + " nickel");
    }

    if (pennies > 1) {

      System.out.println(pennies + " pennies");

    } else if (pennies == 1) {
      System.out.println(pennies + " penny");
    }
  }
}
