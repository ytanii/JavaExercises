import java.util.Scanner;

public class Ex5_51_LongestCommonPrefix {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the first string: ");
    String s1 = scanner.nextLine();

    System.out.print("Enter the second string: ");
    String s2 = scanner.nextLine();

    String prefix = "";

    boolean doesHaveCommonPrefix = false;

    for (int i = 0; i <= ((s1.length() < s2.length()) ? s1.length() - 1 : s2.length() - 1); i++) {
      if (s1.charAt(i) == s2.charAt(i)) {
        prefix += s1.charAt(i);
        doesHaveCommonPrefix = true;
      } else {
        break;
      }
    }

    if (prefix.length() > 0 && doesHaveCommonPrefix) {
      System.out.println("The common prefix is " + prefix);
    } else {
      System.out.println(s1 + " and " + s2 + " have no common prefix");
    }
  }
}
