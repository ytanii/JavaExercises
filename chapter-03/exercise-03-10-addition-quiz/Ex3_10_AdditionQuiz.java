import java.util.Scanner;

public class Ex3_10_AdditionQuiz {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int number1 = (int) (Math.random() * 100);
    int number2 = (int) (Math.random() * 100);
    int correctAnswer = number1 + number2;
    System.out.println("What is the result of " + number1 + " + " + number2 + " = ?");
    int input = scanner.nextInt();

    if (input == correctAnswer) {
      System.out.println("You are correct, " + number1 + " + " + number2 + " = " + input);
    } else {
      System.out.println(
          "You are incorrect, "
              + number1
              + " + "
              + number2
              + " = is "
              + correctAnswer
              + " not "
              + input);
    }
  }
}
