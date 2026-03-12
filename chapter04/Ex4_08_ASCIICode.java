import java.util.Scanner;

public class Ex4_08_ASCIICode {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter ASCII code: ");
    int decNumber = scanner.nextInt();

    if (decNumber < 0 || decNumber > 127) {
      System.out.println("Enter a valid ASCII code.");
      System.exit(1);
    }

    char ch = (char) decNumber;

    System.out.println("The character for ASCII code " + decNumber + " is " + ch);
  }
}
