import java.util.Scanner;

public class Ex5_49_CountVowelsAndConso {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String s = scanner.nextLine();

    int numberOfVowels = 0;
    int numberOfConsonants = 0;
    for (int i = 0; i <= s.length() - 1; i++) {
      char ch = s.toLowerCase().charAt(i);
      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        numberOfVowels++;
      } else if (ch == ' ') {

      } else {
        numberOfConsonants++;
      }
    }

    System.out.println("The number of vowels is " + numberOfVowels);
    System.out.println("The number of consonants is " + numberOfConsonants);
  }
}
