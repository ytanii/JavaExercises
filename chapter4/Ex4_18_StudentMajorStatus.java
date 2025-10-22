import java.util.Scanner;

public class Ex4_18_StudentMajorStatus {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter two characters: ");
    String majorAndStatus = scanner.nextLine();
    String major = "";
    String grade = "";

    boolean isCorrectMaj =
        Character.isAlphabetic(majorAndStatus.charAt(0))
            && "MIC".indexOf(majorAndStatus.charAt(0)) != -1;
    boolean isCorrectGrade =
        Character.isDigit(majorAndStatus.charAt(1))
            && majorAndStatus.charAt(1) <= '4'
            && majorAndStatus.charAt(1) >= '1';

    if (major.length() < 2) {
      System.out.println("Enter two characters");
      System.exit(1);
    }

    if (isCorrectMaj) {
      switch (majorAndStatus.charAt(0)) {
        case 'M':
          major = "Mathematics";
          break;
        case 'C':
          major = "Computer Science";
          break;
        case 'I':
          major = "Information Technology";
          break;
      }
    } else {
      System.out.println("Invalid major");
    }

    if (isCorrectGrade) {
      switch (majorAndStatus.charAt(1)) {
        case '1':
          grade = "Freshman";
          break;
        case '2':
          grade = "Sophmore";
          break;
        case '3':
          grade = "Junior";
          break;
        case '4':
          grade = "Senior";
          break;
      }
    } else {
      System.out.println("Invalid grade");
    }

    if (isCorrectGrade && isCorrectMaj) {
      System.out.println(major + " " + grade);
    }
  }
}
