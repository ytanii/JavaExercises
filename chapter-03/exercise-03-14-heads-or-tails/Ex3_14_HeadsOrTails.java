import java.util.Scanner;

public class Ex3_14_HeadsOrTails {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int generatedNumber = (int) (Math.random() * 2);

    String flipResult = generatedNumber == 1 ? "heads" : "tails";

    System.out.println("Enter a guess heads or tails (lowercase): ");
    String guess = scanner.nextLine();

    if (guess.equals(flipResult)) {
      System.out.println("Good guess! It was " + flipResult);
    } else {
      System.out.println("Incorrect next time, It was " + flipResult);
    }
  }
}
