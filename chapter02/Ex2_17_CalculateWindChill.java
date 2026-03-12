import java.util.Scanner;

public class Ex2_17_CalculateWindChill {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the temperature in Fahrenheit between -58F and 41F: ");
    double temperature = scanner.nextDouble();

    System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
    double windSpeed = scanner.nextDouble();

    double windChillIndex =
        35.74
            + (0.6215 * temperature)
            - (35.75 * Math.pow(windSpeed, 0.16))
            + (0.4275 * temperature * Math.pow(windSpeed, 0.16));

    System.out.println(
        "The wind chill index is " + (int) (windChillIndex * 100000 - 0.5) / 100000.0);
  }
}
