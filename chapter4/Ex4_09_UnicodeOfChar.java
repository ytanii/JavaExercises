import java.util.Scanner;

public class Ex4_09_UnicodeOfChar {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a character: ");
    String s = scanner.nextLine();

    char ch = s.charAt(0);

    int decNumber = (int) ch;

    System.out.println("The Unicode for the character " + ch + " is " + decNumber);
  }
}
