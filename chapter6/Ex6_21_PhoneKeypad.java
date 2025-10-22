import java.util.Scanner;

public class Ex6_21_PhoneKeypad {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a phone number: ");
    String phoneNumber = scanner.nextLine();
    String translatedPhoneNumber = "";

    for (int i = 0; i <= phoneNumber.length() - 1; i++) {

      if (getNumber(phoneNumber.charAt(i)) != 0) {
        translatedPhoneNumber += getNumber(phoneNumber.charAt(i));
      } else {
        translatedPhoneNumber += phoneNumber.charAt(i);
      }
    }

    System.out.println(translatedPhoneNumber);
  }

  public static int getNumber(char uppercaseLetter) {
    if (Character.isLetter(uppercaseLetter)) {
      char letter = Character.toLowerCase(uppercaseLetter);
      if ("abc".contains(String.valueOf(letter))) {
        return 2;
      } else if ("def".contains(String.valueOf(letter))) {
        return 3;

      } else if ("ghi".contains(String.valueOf(letter))) {
        return 4;

      } else if ("jkl".contains(String.valueOf(letter))) {
        return 5;

      } else if ("mno".contains(String.valueOf(letter))) {
        return 6;

      } else if ("pqrs".contains(String.valueOf(letter))) {
        return 7;

      } else if ("tuv".contains(String.valueOf(letter))) {
        return 8;

      } else if ("wxyz".contains(String.valueOf(letter))) {
        return 9;
      }
    }

    return 0;
  }
}
