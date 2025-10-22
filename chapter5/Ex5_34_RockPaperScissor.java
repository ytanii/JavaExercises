import java.util.Scanner;

public class Ex5_34_RockPaperScissor {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int wins = 0;
    int losses = 0;
    String computerChoiceName = "";
    String userChoiceName = "";

    while (Math.abs(wins - losses) < 3) {
      int userChoice = -1;
      int computerChoice = (int) (Math.random() * 3);
      System.out.print("Pick Rock(0) Paper(1) Scissors(2): ");
      while (userChoice != 0 && userChoice != 1 && userChoice != 2) {
        userChoice = scanner.nextInt();
      }

      switch (computerChoice) {
        case 0 -> {
          computerChoiceName = "Rock";
        }
        case 1 -> {
          computerChoiceName = "Paper";
        }
        case 2 -> {
          computerChoiceName = "Scissors";
        }
      }

      switch (userChoice) {
        case 0 -> {
          userChoiceName = "Rock";
        }
        case 1 -> {
          userChoiceName = "Paper";
        }
        case 2 -> {
          userChoiceName = "Scissors";
        }
      }

      if (userChoice == computerChoice) {
        System.out.println(
            "You picked "
                + userChoiceName
                + " and the computer picked "
                + computerChoiceName
                + ", so it is a draw.");
      } else if (userChoice == 0 && computerChoice == 2) {
        System.out.println(
            "You picked "
                + userChoiceName
                + " and the computer picked "
                + computerChoiceName
                + ", so you win.");
        wins++;
      } else if (userChoice == 2 && computerChoice == 0) {
        System.out.println(
            "You picked "
                + userChoiceName
                + " and the computer picked "
                + computerChoiceName
                + ", so you lose.");
        losses++;
      } else if (userChoice == 1 && computerChoice == 0) {
        System.out.println(
            "You picked "
                + userChoiceName
                + " and the computer picked "
                + computerChoiceName
                + ", so you win.");
        wins++;

      } else if (userChoice == 0 && computerChoice == 1) {
        System.out.println(
            "You picked "
                + userChoiceName
                + " and the computer picked "
                + computerChoiceName
                + ", so you lose.");
        losses++;

      } else if (userChoice == 2 && computerChoice == 1) {
        System.out.println(
            "You picked "
                + userChoiceName
                + " and the computer picked "
                + computerChoiceName
                + ", so you win.");
        wins++;

      } else if (userChoice == 1 && computerChoice == 2) {
        System.out.println(
            "You picked "
                + userChoiceName
                + " and the computer picked "
                + computerChoiceName
                + ", so you lose.");
        losses++;
      }
    }

    System.out.println();

    if (wins - losses > 2) {
      System.out.println("You win the game!");
    } else {
      System.out.println("Try again!");
    }
  }
}
