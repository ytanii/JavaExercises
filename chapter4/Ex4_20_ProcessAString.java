import java.util.Scanner;

public class Ex4_20_ProcessAString {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a string: ");
    String s = scanner.nextLine();

    if (s.length() > 0) {
      System.out.println(
          "The length of the string is "
              + s.length()
              + " and the first character is "
              + s.charAt(0));
    }
  }
}
