import java.util.Scanner;

public class Ex5_17_DisplayPyramid {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the number of lines: ");
    int numberOfLines = scanner.nextInt();

    int width = String.valueOf(numberOfLines).length() + 1;

    String line = String.format("%-" + width + "d", 1);

    String firstPart = "";
    String lastPart = "";

    for (int j = 0; j < numberOfLines - 1; j++) {
      System.out.print(" ".repeat(width));
    }
    System.out.println(line);

    for (int i = 2; i <= numberOfLines; i++) {
      String formatted = String.format("%-" + width + "d", i);

      firstPart = formatted + firstPart;
      lastPart = lastPart + formatted;

      for (int j = 0; j < numberOfLines - i; j++) {
        System.out.print(" ".repeat(width));
      }
      System.out.println(firstPart + line + lastPart);
    }
  }
}
