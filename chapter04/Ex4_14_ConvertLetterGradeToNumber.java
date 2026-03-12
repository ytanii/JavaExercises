import java.util.Scanner;

public class Ex4_14_ConvertLetterGradeToNumber {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a letter grade: ");
    String s = scanner.nextLine();

    char ch = s.charAt(0);
    int numValue = 0;
    switch (ch) {
      case 'A':
        numValue = 4;
        break;
      case 'B':
        numValue = 3;
        break;
      case 'C':
        numValue = 2;
        break;
      case 'D':
        numValue = 1;
        break;
      case 'F':
        numValue = 0;
        break;
      default:
        System.out.println(ch + " is an invalid grade");
        System.exit(1);
    }

    System.out.println("The numeric value for grade " + ch + " is " + numValue);
  }
}
