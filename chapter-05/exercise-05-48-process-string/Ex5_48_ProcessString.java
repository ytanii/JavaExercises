import java.util.Scanner;

public class Ex5_48_ProcessString {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String s = scanner.nextLine();

    for (int i = 0; i <= s.length() - 1; i++) {
      if ((i + 1) % 2 != 0) {
        System.out.print(s.charAt(i));
      }
    }
  }
}
