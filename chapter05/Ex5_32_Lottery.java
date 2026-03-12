import java.util.Scanner;

public class Ex5_32_Lottery {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int firstDigit = (int) (Math.random() * 10);
    int secondDigit = (int) (Math.random() * 10);

    while (firstDigit == secondDigit) {
      secondDigit = (int) (Math.random() * 10);
    }

    System.out.print("Enter your guess (positive two digit integer) for the lottery: ");

    int firstDigitGuess = 0;
    int secondDigitGuess = 0;
    while (true) {
      String guess = scanner.nextLine();
      if (guess.length() == 2
          && guess.length() > 0
          && (Character.isDigit(guess.charAt(0)) && Character.isDigit(guess.charAt(1)))) {
        firstDigitGuess = (guess.charAt(0)) - '0';
        secondDigitGuess = (guess.charAt(1)) - '0';
        break;
      } else {
        System.out.print("Please enter valid positive two digit number: ");
      }
    }

    if (firstDigit == firstDigitGuess && secondDigit == secondDigitGuess) {
      System.out.println("Congratulations! You won $10000");
    } else if ((firstDigit == secondDigitGuess) && (secondDigit == firstDigitGuess)) {
      System.out.println("Congratulations! You won $3000");
    } else if ((firstDigit == firstDigitGuess || firstDigit == secondDigitGuess)
        || (secondDigit == firstDigitGuess || secondDigit == secondDigitGuess)) {
      System.out.println("Congratulations! You won $1000");
    } else {
      System.out.println("Unlucky! Next time");
    }
    System.out.println("The magic number was " + firstDigit + secondDigit);
  }
}
