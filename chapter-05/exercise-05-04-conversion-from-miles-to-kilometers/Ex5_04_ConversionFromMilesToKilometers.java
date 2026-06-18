import java.util.Scanner;

public class Ex5_04_ConversionFromMilesToKilometers {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Miles         Kilometers");
    for (int i = 1; i < 11; i++) {
      System.out.println(i + "           \t" + (int) ((i * 1.609) * 10000) / 10000.0);
    }
  }
}
