import java.util.Scanner;

public class Ex5_46_ReverseAString {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String s = scanner.nextLine();
    String backwardS = "";

    for (int i = s.length() - 1; i >= 0; i--) {
      char ch = s.charAt(i);
      backwardS += ch;
    }

    System.out.println("The reversed string is " + backwardS);
  }
}
