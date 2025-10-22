import java.util.Scanner;

public class Ex3_17_RockPaperScissor {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int generatedNumber = (int) (Math.random() * 3);
    String computerChoice = " ";

    switch (generatedNumber) {
      case 0:
        computerChoice = "scissor";
        break;
      case 1:
        computerChoice = "rock";
        break;
      case 2:
        computerChoice = "paper";
        break;
    }

    System.out.print("scissor (0), rock (1), paper (2): ");
    int input = scanner.nextInt();
    String playerChoice = " ";

    switch (input) {
      case 0:
        playerChoice = "scissor";
        break;
      case 1:
        playerChoice = "rock";
        break;
      case 2:
        playerChoice = "paper";
        break;
    }

    boolean draw = input == generatedNumber;
    boolean win = false;

    if ((generatedNumber == 0 && input == 1)
        || (generatedNumber == 1 && input == 2)
        || (generatedNumber == 2 && input == 0)) {
      win = true;
    }

    if (draw) {
      System.out.println(
          "The computer is " + computerChoice + ". You are " + playerChoice + ". It is a draw.");
    } else if (win) {
      System.out.println(
          "The computer is " + computerChoice + ". You are " + playerChoice + ". You won.");

    } else {
      System.out.println(
          "The computer is " + computerChoice + ". You are " + playerChoice + ". You lost.");
    }
  }
}
