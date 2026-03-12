import java.util.Scanner;

public class Ex6_06_DisplayPattern {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter an integer: ");
    int number = scanner.nextInt();

    displayPattern(number);
  }

  public static void displayPattern(int number) {
    for (int j = 1; j <= number; j++) {
      for (int i = number; i > j; i--) {
        System.out.print("   ");
      }
      for (int i = j; i >= 1; i--) {
        System.out.printf("%2d ", i);
      }
      System.out.println();
    }
  }
}
