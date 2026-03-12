import java.util.Scanner;

public class Ex4_11_DecimalToHex {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a decimal value (0 to 15): ");
    int decNumber = scanner.nextInt();

    if (decNumber < 0 || decNumber > 15) {
      System.out.println(decNumber + " is an invalid input");
      System.exit(1);
    }

    String hexValue = (decNumber < 10) ? "" + decNumber : "" + (char) ('A' + decNumber - 10);

    System.out.println("The hex value is " + hexValue);
  }
}
