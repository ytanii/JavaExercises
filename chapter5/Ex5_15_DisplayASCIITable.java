import java.util.Scanner;

public class Ex5_15_DisplayASCIITable {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int count = '!';
    int charPerLineCount = 0;

    while (count <= '~') {
      if (charPerLineCount % 10 == 0 && charPerLineCount > 0) {
        System.out.println();
        charPerLineCount++;
      }
      System.out.print(" " + ((char) (count)));
      count++;
      charPerLineCount++;
    }
  }
}
