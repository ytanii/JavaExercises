import java.util.Scanner;

public class Ex4_16_RandomCharacter {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int randomNumber = (int) (Math.random() * 26) + 65;

    char randomUpperCaseLetter = (char) randomNumber;

    System.out.println("The letter is: " + randomUpperCaseLetter);
  }
}
