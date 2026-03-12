import java.util.Scanner;

public class Ex4_15_PhoneKeyPad {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a letter: ");
    String s = scanner.nextLine();

    char c = s.charAt(0);
    char ch = s.toLowerCase().charAt(0);
    int number = 0;

    if (Character.isAlphabetic(ch)) {

      if ("abc".indexOf(ch) != -1) {
        number = 2;
      } else if ("def".indexOf(ch) != -1) {
        number = 3;
      } else if ("ghi".indexOf(ch) != -1) {
        number = 4;
      } else if ("jkl".indexOf(ch) != -1) {
        number = 5;
      } else if ("mno".indexOf(ch) != -1) {
        number = 6;
      } else if ("pqrs".indexOf(ch) != -1) {
        number = 7;
      } else if ("tuv".indexOf(ch) != -1) {
        number = 8;
      } else if ("wxyz".indexOf(ch) != -1) {
        number = 9;
      }

      System.out.println("The corresponding number is " + number);

    } else {
      System.out.println(c + " is an invalid input");
    }
  }
}
