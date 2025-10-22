import java.util.Scanner;

public class Ex6_17_PrintMatrix {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter n: ");
    printMatrix(scanner.nextInt());
  }

  public static void printMatrix(int number) {
    for (int n = 0; n < number; n++) {
      for (int i = 0; i < number; i++) {
        System.out.print(((int) (Math.random() * 2)) + " ");
      }
      System.out.println();
    }
  }
}
