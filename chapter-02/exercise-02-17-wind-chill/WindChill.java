import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        double fahrenheitDegrees = scanner.nextDouble();

        System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
        double windSpeed = scanner.nextDouble();

        double windChillIndex = 35.74 + (0.6215 * fahrenheitDegrees) - (35.75 * Math.pow(windSpeed, 0.16)) + (0.4275 * fahrenheitDegrees * Math.pow(windSpeed, 0.16));

        System.out.printf("The wind chill index is %.5f", windChillIndex);
    }
}
