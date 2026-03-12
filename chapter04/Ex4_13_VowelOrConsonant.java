import java.util.Scanner;

public class Ex4_13_VowelOrConsonant {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a letter: ");
    String s = scanner.nextLine();

    boolean isVowel = false;

    char c = s.charAt(0);

    char ch = s.toUpperCase().charAt(0);

    if (Character.isAlphabetic(ch)) {
      switch (ch) {
        case 'A':
          isVowel = true;
          break;
        case 'I':
          isVowel = true;
          break;
        case 'O':
          isVowel = true;
          break;
        case 'U':
          isVowel = true;
          break;
        case 'E':
          isVowel = true;
          break;
        default:
          break;
      }
      System.out.println(c + " is a " + (isVowel ? "vowel" : "consonant"));

    } else {
      System.out.println(ch + " is an invalid input");
    }
  }
}
