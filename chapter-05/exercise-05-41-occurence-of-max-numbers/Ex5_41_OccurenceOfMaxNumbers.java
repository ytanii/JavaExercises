import java.util.Scanner;

public class Ex5_41_OccurenceOfMaxNumbers {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int integerInput = -1;
    int occurrenceOfMax = 0;
    int max = 0;

    System.out.print("Enter integers (0 to quit): ");

    while (integerInput != 0) {
      integerInput = scanner.nextInt();

      if (integerInput > max) {
        max = integerInput;
        occurrenceOfMax = 1;
      } else if (integerInput == max) {
        occurrenceOfMax++;
      }
    }

    if (max == 0) {
      System.out.println("No numbers entered except 0");
    } else {

      System.out.println("The largest number is " + max);
      System.out.println("The occurrence count of the largest number is " + occurrenceOfMax);
    }
  }
}
