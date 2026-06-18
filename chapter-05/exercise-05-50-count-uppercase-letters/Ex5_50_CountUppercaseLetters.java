import java.util.Scanner;

public class Ex5_50_CountUppercaseLetters {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String s = scanner.nextLine();

    int numberOfUppercaseLetters = 0;

    for (int i = 0; i <= s.length() - 1; i++) {
      if (Character.isUpperCase(s.charAt(i))) {
        numberOfUppercaseLetters++;
      }
    }

    System.out.println("The number of uppercase letters is " + numberOfUppercaseLetters);
  }
}
