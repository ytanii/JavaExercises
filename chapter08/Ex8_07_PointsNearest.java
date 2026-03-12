import java.util.Scanner;

public class Ex8_07_PointsNearest {
    public static void main(String[] args) {
        double[][] points = {{-1, 0, 3}, {-1, -1, -1}, {4, 1, 1}, {2, 0.5, 9}, {3.5, 2, -1}, {3, 1.5, 3}, {-1.5, 4, 2}, {5.5, 4, -0.5}};

        double[][] distancesBetweenPoints = getDistances(points);


        int[] closestPoints = findClosestPoints(distancesBetweenPoints, points);

        System.out.println("The two closest points are " + "(" + points[closestPoints[0]][0] + ", " + points[closestPoints[0]][1] + ", " + points[closestPoints[0]][2] + ") and " + "(" + points[closestPoints[1]][0] + ", " + points[closestPoints[1]][1] + ", " + points[closestPoints[1]][2] + ")");


    }

    public static double[][] getDistances(double[][] points) {
        double[][] distancesBetweenPoints = new double[points.length][points.length];

        for (int point = 0; point < distancesBetweenPoints.length; point++) {
            for (int i = 1 + point; i < points.length; i++) {
                double distance = Math.sqrt(Math.pow(points[i][0] - points[point][0], 2) + Math.pow(points[i][1] - points[point][1], 2) + Math.pow(points[i][2] - points[point][2], 2));
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
