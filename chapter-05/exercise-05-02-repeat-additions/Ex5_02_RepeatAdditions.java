import java.util.Scanner;

public class Ex5_02_RepeatAdditions {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int count = 0, correctCount = 0;
    long startTime = System.currentTimeMillis();
    String record = "";
    System.out.println("Enter your guess: ");

    do {
      int number1 = (int) ((Math.random() * 15) + 1);
      int number2 = (int) ((Math.random() * 15) + 1);
      int guess = 0;

      System.out.print(number1 + " + " + number2 + " = ");
      guess = scanner.nextInt();

      if ((number1 + number2) == guess) {
        correctCount++;
        System.out.println("You are correct!");
      } else {
        System.out.println("Incorrect");
      }
      count++;
      record +=
          number1
              + " + "
              + number2
              + " = "
              + guess
              + (((number1 + number2) == guess) ? " Correct\n" : " Incorrect\n");

    } while (count < 10);

    long endTime = System.currentTimeMillis();

    long seconds = (endTime - startTime) / 1000;

    System.out.println();

    System.out.println(
        "You got " + correctCount + "/10 questions right in " + seconds + " seconds .");

    System.out.println(record);
  }
}
