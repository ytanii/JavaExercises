import java.util.Scanner;

public class Ex5_08_FindTheHighestScore {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String highestScoreStudent = "";
    int numberOfStudents = 0;

    System.out.print("Enter the number of students: ");
    numberOfStudents = Integer.valueOf(scanner.next());

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
        highestScore = score;
        highestScoreStudent = studentName;
      }
    }

    System.out.println(
        "The student with the highest score is "
            + highestScoreStudent
            + " with a score of "
            + highestScore);
  }
}
