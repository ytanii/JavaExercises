import java.util.Scanner;

public class Ex8_21_CentralCity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number of cities: ");
        int numberOfCities = scanner.nextInt();

        double[][] cityCoordinates = new double[numberOfCities][2];

        System.out.println("Enter the coordinates of the cities: ");

        for (int i = 0; i < cityCoordinates.length; i++) {
            for (int j = 0; j < 2; j++) {
                cityCoordinates[i][j] = scanner.nextDouble();
            }
        }

        double minTotalDistance = Integer.MAX_VALUE;
        double minX = 0;
        double minY = 0;

        for (int i = 0; i < cityCoordinates.length; i++) {
            double totalDistance = 0;
            double x = cityCoordinates[i][0];
            double y = cityCoordinates[i][1];
            for (int j = 0; j < cityCoordinates.length; j++) {
                if (i != j) {
                    totalDistance += getDistance(x, y, cityCoordinates[j][0], cityCoordinates[j][1]);

                }

            }
            if (minTotalDistance > totalDistance) {
                minTotalDistance = totalDistance;
                minX = cityCoordinates[i][0];
                minY = cityCoordinates[i][1];
            }
        }


        System.out.println("The central city is at " + "(" + minX + ", " + minY + ")");
        System.out.printf("The total distance to all other cities is %.2f", minTotalDistance);


    }

    public static double getDistance(double x1, double y1, double x2, double y2) {

        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

    }
}
