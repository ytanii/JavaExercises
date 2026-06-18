import java.util.Scanner;

public class Ex5_44_BitLevelOperations {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter an integer: ");
    short value = scanner.nextShort();

    for (int i = 15; i >= 0; i--) {
      int bit = (value >> i) & 1;
      System.out.print(bit);
    }
    System.out.println();
  }
}
