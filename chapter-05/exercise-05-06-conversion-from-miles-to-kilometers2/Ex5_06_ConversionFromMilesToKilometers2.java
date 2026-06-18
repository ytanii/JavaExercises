import java.util.Scanner;

public class Ex5_06_ConversionFromMilesToKilometers2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Miles  Kilometers     Kilometers     Miles");
    for (int i = 1, n = 20; i < 10 || n <= 65; i++, n += 5) {
      System.out.printf("%-10d %-12.3f| %-10d %.3f%n", i, i * 1.609, n, n / 1.609);
    }
  }
}
