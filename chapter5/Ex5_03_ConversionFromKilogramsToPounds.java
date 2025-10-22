import java.util.Scanner;

public class Ex5_03_ConversionFromKilogramsToPounds {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Kilograms     Pounds");
    for (int i = 1; i < 201; i += 2) {
      System.out.println(i + "            \t" + (int) ((i * 2.2) * 1000) / 1000.0);
    }
  }
}
