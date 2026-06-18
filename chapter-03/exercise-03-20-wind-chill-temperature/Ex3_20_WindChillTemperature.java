import java.util.Scanner;

public class Ex3_20_WindChillTemperature {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a temperature in fahrenheit between -58 and 41: ");
    double temperature = scanner.nextDouble();

    System.out.print("Enter a wind speed (>= 2) in miles per hours: ");
    double windSpeed = scanner.nextDouble();

    if (windSpeed >= 2 && (temperature >= -58 && temperature <= 41)) {
      double windChillIndex =
          35.74
              + 0.6215 * temperature
              - 35.75 * Math.pow(windSpeed, 0.16)
              + 0.4275 * temperature * Math.pow(windSpeed, 0.16);
      System.out.println("The wind chill index is " + (int) (windChillIndex * 100000) / 100000.0);
    } else {
      if (windSpeed < 2 && (temperature < -58 || temperature > 41)) {
        System.out.println("Enter a valid temperature and wind speed");
      } else if (windSpeed < 2) {
        System.out.println("Enter a valid wind speed");
      } else {
        System.out.println("Enter a valid temperature");
      }
    }
  }
}
