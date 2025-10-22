import java.util.Scanner;

public class Ch6_Listing_6_8_HexToDec {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a hex number: ");
    String hex = scanner.nextLine();

    System.out.println(
        "The decimal value for hex number " + hex + " is " + hexToDecimal(hex.toUpperCase()));
  }

  public static int hexToDecimal(String hex) {

    int decimalNumber = 0;
    for (int i = hex.length() - 1, j = 0; i >= 0 && j <= hex.length() - 1; i--, j++) {
      decimalNumber += hexCharToDecimal(hex.charAt(j)) * (int) Math.pow(16, i);
    }
    return decimalNumber;
  }

  public static int hexCharToDecimal(char ch) {
    return (Character.isDigit(ch) ? ch - '0' : ch - 'A' + 10);
  }
}
