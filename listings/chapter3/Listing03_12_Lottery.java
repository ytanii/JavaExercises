import java.util.Scanner;

public class Listing03_12_Lottery {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int winNumber = (int) (Math.random() * 100);

    System.out.println("Enter a two number less than 3 digits");
    int input = scanner.nextInt();
    int firstDigit = 0;
    int secondDigit = 0;
    int firstDigitOfWin = 0;
    int secondDigitOfWin = 0;

    firstDigit = input / 10;
    secondDigit = input % 10;
    firstDigitOfWin = winNumber / 10;
    secondDigitOfWin = winNumber % 10;
    if (input < 10) {
      firstDigit = 0;
    }
    if (winNumber < 10) {
      firstDigitOfWin = 0;
    }

    if (firstDigit == firstDigitOfWin && secondDigit == secondDigitOfWin) {
      System.out.println("You win $10000!");
    } else if ((firstDigit == firstDigitOfWin || firstDigit == secondDigitOfWin)
        && (secondDigit == firstDigitOfWin || secondDigit == secondDigitOfWin)) {
      System.out.println("You win $3000!");

    } else if ((firstDigit == firstDigitOfWin || secondDigit == firstDigitOfWin)
        || (secondDigit == secondDigitOfWin || firstDigit == firstDigitOfWin)) {
      System.out.println("You win $1000!");
    } else {
      System.out.println("Unlucky, Next time!");
    }
    System.out.println("The winning number was " + winNumber);
  }
}
