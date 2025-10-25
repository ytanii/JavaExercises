import java.util.Scanner;

public class Listing08_03_FindNearestPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of points: ");
        double[][] points = new double[scanner.nextInt()][2];
        System.out.println("Enter points: (for example 1 2)");

        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[0].length; j++) {
                points[i][j] = scanner.nextDouble();
            }
        }

        double[][] distancesBetweenPoints = getDistances(points);

        for (int i = 0; i < distancesBetweenPoints.length; i++) {
            for (int j = 0; j < distancesBetweenPoints[i].length; j++) {
                System.out.print(distancesBetweenPoints[i][j] + " ");
            }
            System.out.println();
        }

        int[] closestPoints = findClosestPoints(distancesBetweenPoints, points);

        System.out.println("The two closest points are " + "(" + points[closestPoints[0]][0] + ", " + points[closestPoints[0]][1] + ") and " + "(" + points[closestPoints[1]][0] + ", " + points[closestPoints[1]][1] + ")");


    }

    public static double[][] getDistances(double[][] points) {
        double[][] distancesBetweenPoints = new double[points.length][points.length];

        for (int point = 0; point < distancesBetweenPoints.length; point++) {
            for (int i = 1 + point; i < points.length; i++) {
                double distance = Math.sqrt(Math.pow(points[i][0] - points[point][0], 2) + Math.pow(points[i][1] - points[point][1], 2));
                distancesBetweenPoints[point][i] = distance;

            }
        }

        return distancesBetweenPoints;
    }

    public static int[] findClosestPoints(double[][] distances, double[][] points) {
        double min = Double.MAX_VALUE;
        int minRowIndex = 0;
        int minColumnIndex = 0;


        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < distances[i].length; j++) {
                if (min > distances[i][j] && i != j && distances[i][j] != 0) {
                    min = distances[i][j];
                    minRowIndex = i;
                    minColumnIndex = j;
                }
            }

        }

        int[] closestPoints = {minRowIndex, minColumnIndex};

        return closestPoints;

    }
}
