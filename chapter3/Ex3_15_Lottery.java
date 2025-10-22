import java.util.Scanner;

public class Ex3_15_Lottery {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int lotteryNumber = 100 + ((int) (Math.random() * 900));

    int amount = lotteryNumber;

    int lotteryNumberDigit1 = amount % 10;
    amount /= 10;
    int lotteryNumberDigit2 = amount % 10;
    amount /= 10;
    int lotteryNumberDigit3 = amount % 10;

    System.out.print("Enter a three number to enter the lottery: ");
    int input = scanner.nextInt();

    amount = input;

    int inputNumberDigit1 = amount % 10;
    amount /= 10;
    int inputNumberDigit2 = amount % 10;
    amount /= 10;
    int inputNumberDigit3 = amount % 10;

    boolean fullWinner = lotteryNumber == input;
    boolean partialWinner = false;

    if (!fullWinner) {
      int l1 = lotteryNumberDigit1;
      int l2 = lotteryNumberDigit2;
      int l3 = lotteryNumberDigit3;

      if (inputNumberDigit1 == l1) {
        l1 = -1;
      } else if (inputNumberDigit1 == l2) {
        l2 = -1;
      } else if (inputNumberDigit1 == l3) {
        l3 = -1;
      } else {
        partialWinner = false;
      }

      if (inputNumberDigit2 == l1) {
        l1 = -1;
      } else if (inputNumberDigit2 == l2) {
        l2 = -1;
      } else if (inputNumberDigit2 == l3) {
        l3 = -1;
      } else {
        partialWinner = false;
      }

      if (inputNumberDigit3 == l1) {
        l1 = -1;
      } else if (inputNumberDigit3 == l2) {
        l2 = -1;
      } else if (inputNumberDigit3 == l3) {
        l3 = -1;
      } else {
        partialWinner = false;
      }

      if (l1 == -1 && l2 == -1 && l3 == -1) {
        partialWinner = true;
      }
    }

    boolean singleMatch = false;

    if (!fullWinner && !partialWinner) {
      if (inputNumberDigit1 == lotteryNumberDigit1
          || inputNumberDigit1 == lotteryNumberDigit2
          || inputNumberDigit1 == lotteryNumberDigit3
          || inputNumberDigit2 == lotteryNumberDigit1
          || inputNumberDigit2 == lotteryNumberDigit2
          || inputNumberDigit2 == lotteryNumberDigit3
          || inputNumberDigit3 == lotteryNumberDigit1
          || inputNumberDigit3 == lotteryNumberDigit2
          || inputNumberDigit3 == lotteryNumberDigit3) {
        singleMatch = true;
      }
    }
    System.out.println("The number was " + lotteryNumber);

    if (fullWinner) {
      System.out.println("You win $10,000!");
    } else if (partialWinner) {
      System.out.println("You win $3,000!");
    } else if (singleMatch) {
      System.out.println("You win $1,000!");
    } else {
      System.out.println("Sorry, no match.");
    }
  }
}
