import java.util.Scanner;

public class Ex5_05_ConversionFromKilogramsToPounds2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Kilograms  Pounds     Pounds     Kilograms");
    for (int i = 1, n = 20; i < 200 || n < 515; i += 2, n += 5) {
      System.out.printf("%-10d %-12.1f| %-10d %.2f%n", i, i * 2.2, n, n / 2.2);
    }
  }
}
