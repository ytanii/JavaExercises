import java.util.Scanner;

public class Listing05_14_Palindrome {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a  word: ");

    String word = scanner.nextLine();

    int i = 0;
    boolean isPalindrome = true;

    while (i < word.length() / 2) {
      if (!(word.toLowerCase().charAt(word.length() - (1 + i))
          == word.toLowerCase().charAt(0 + i))) {
        isPalindrome = false;
        break;
      }
      i++;
    }

    if (isPalindrome) {
      System.out.println(word + " is a palindrome!");
    } else {
      System.out.println(word + " is not a palindrome");
    }
  }
}
