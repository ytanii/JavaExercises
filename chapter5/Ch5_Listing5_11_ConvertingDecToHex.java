import java.util.Scanner;

public class Ch5_Listing5_11_ConvertingDecToHex {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a decimal number: ");
    int decimalNumber = scanner.nextInt();

    String hexResult = "";

    while (decimalNumber > 0) {
      int remainder = decimalNumber % 16;

      if (remainder >= 10) {
        char hexChar = (char) ('A' + remainder - 10);
        hexResult = hexChar + hexResult;
      } else {
        hexResult = remainder + hexResult;
      }

      decimalNumber /= 16;
    }

    if (hexResult.length() == 0) System.out.println("The hex number is 0");
    else System.out.println("The hex number is " + hexResult);
  }
}
