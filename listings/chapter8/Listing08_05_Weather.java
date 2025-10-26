// input file link: https://liveexample.pearsoncmg.com/data/Weather.txt

import java.util.Scanner;

public class Listing08_05_Weather {
    public static void main(String[] args) {

        double[][][] weatherData = readWeatherData();

        for (int day = 0; day < weatherData.length; day++) {
            double totalDailyTemperature = 0;
            double totalDailyHumidity = 0;
            for (int hour = 0; hour < weatherData[day].length; hour++) {
                totalDailyTemperature += weatherData[day][hour][0];
                totalDailyHumidity += weatherData[day][hour][1];

            }


            double averageDailyTemperature = totalDailyTemperature / 24.0;
            double averageDailyHumidity = totalDailyHumidity / 24.0;

            System.out.println("Day " + day + "'s average temperature is " + averageDailyTemperature);
            System.out.println("Day " + day + "'s average humidity is " + averageDailyHumidity);


        }


    }

    public static double[][][] readWeatherData() {
        Scanner scanner = new Scanner(System.in);
        double[][][] data = new double[10][24][2];

        for (int k = 0; k < 10 * 24; k++) {
            int day = scanner.nextInt();
            int hour = scanner.nextInt();

            double temperature = scanner.nextDouble();
            double humidity = scanner.nextDouble();

            data[day - 1][hour - 1][0] = temperature;
            data[day - 1][hour - 1][1] = humidity;
        }

        return data;
    }
}
