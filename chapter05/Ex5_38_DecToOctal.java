import java.util.Scanner;

public class Ex5_38_DecToOctal {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a decimal integer: ");
    String decimalNumber = scanner.nextLine();

    String binary = "";
    while (!decimalNumber.equals("0")) {
      String quotient = "";
      int remainder = 0;

      for (int i = 0; i < decimalNumber.length(); i++) {
        int current = remainder * 10 + (decimalNumber.charAt(i) - '0');
        int digit = current / 8;
        remainder = current % 8;

        if (!(quotient.isEmpty() && digit == 0)) {
          quotient += digit;
        }
      }

      binary = remainder + binary;

      if (quotient.isEmpty()) {

        quotient = "0";
      }

      decimalNumber = quotient;
    }

    System.out.println("Octal: " + (binary.isEmpty() ? "0" : binary));
  }
}
