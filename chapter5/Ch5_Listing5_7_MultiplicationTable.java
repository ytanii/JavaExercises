import java.util.Scanner;

public class Ch5_Listing5_7_MultiplicationTable {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.printf("%30s", "Multiplication Table\n");

    System.out.println("--------------------------------------");
    System.out.print("x\t");
    for (int n = 1; n <= 9; n++) {
      System.out.print(n + "\t");
    }
    System.out.println();

    for (int i = 1; i <= 9; i++) {
      System.out.print(i + "\t");
      for (int n = 1; n <= 9; n++) {
        System.out.print(i * n + "\t");
      }
      System.out.println();
    }
  }
}
