import java.util.Scanner;

public class Ex6_20_CountLetters {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a string: ");
    System.out.println("Your string has " + countLetters(scanner.nextLine()) + " letters");
  }

  public static int countLetters(String s) {
    int numberOfLetters = 0;
    for (int i = 0; i <= s.length() - 1; i++) {
      if (Character.isLetter(s.charAt(i))) {
        numberOfLetters++;
      }
    }
    return numberOfLetters;
  }
}
