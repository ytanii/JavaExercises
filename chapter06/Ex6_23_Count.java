import java.util.Scanner;

public class Ex6_23_Count {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a string and a character: ");
    String str = scanner.nextLine();
    char ch = scanner.next().charAt(0);

    if (count(str, ch) > 0) {
      System.out.println(ch + " occurs " + count(str, ch) + " times in " + str);
    } else {
      System.out.println("There is no occurrence of " + ch + " in " + str);
    }
  }

  public static int count(String str, char ch) {
    int numberOfMatches = 0;
    for (int i = 0; i <= str.length() - 1; i++) {
      if (str.charAt(i) == ch) {
        numberOfMatches++;
      }
    }
    return numberOfMatches;
  }
}
