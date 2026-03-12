import java.util.Scanner;

public class Ex5_09_FindTwoHighestScore {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String highestScoreStudent = "";
    int numberOfStudents = 0;
    String secondHighestScoreStudent = "";
    int secondHighestScore = 0;

    System.out.print("Enter the number of students: ");
    numberOfStudents = scanner.nextInt();

    System.out.println("Enter the student's name");
    highestScoreStudent = scanner.next();
    System.out.print("Enter the score of the student: ");
    int highestScore = Integer.valueOf(scanner.next());

    for (int i = 0; i < numberOfStudents - 1; i++) {
      System.out.println("Enter the student's name");
      String studentName = scanner.next();
      System.out.print("Enter the score of the student: ");
      int score = Integer.valueOf(scanner.next());

      if (score > highestScore) {
        secondHighestScore = highestScore;
        secondHighestScoreStudent = highestScoreStudent;

        highestScore = score;
        highestScoreStudent = studentName;
      }

      if (score < highestScore) {
        if (score > secondHighestScore) {
          secondHighestScore = score;
          secondHighestScoreStudent = studentName;
        }
      }
    }

    System.out.println(
        "The student with the highest score is "
            + highestScoreStudent
            + " with a score of "
            + highestScore);
    System.out.println(
        "The student with second highest score  is "
            + secondHighestScoreStudent
            + " with a score of "
            + secondHighestScore);
  }
}
