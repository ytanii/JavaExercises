import java.util.Scanner;

public class Ex8_34_RightmostLowestPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 6 points: ");
        double[][] points = new double[6][2];

        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = scanner.nextDouble();
            }
        }

        double[] rightmostLowestPoint = getRightmostLowestPoint(points);

        System.out.println("The rightmost lowest point is (" + rightmostLowestPoint[0] + ", " + rightmostLowestPoint[1] + ")");

    }

    public static double[] getRightmostLowestPoint(double[][] points) {
        int indexOfRightMostLowestPoint = 0;
        for (int i = 0; i < points.length; i++) {
            if (points[indexOfRightMostLowestPoint][1] > points[i][1]) {
                indexOfRightMostLowestPoint = i;
            }
        }
        int lowestYIndex = indexOfRightMostLowestPoint;

        for (int i = 0; i < points.length; i++) {
            if (points[indexOfRightMostLowestPoint][0] < points[i][0]) {
                if (points[i][1] == points[lowestYIndex][1]) {
                    indexOfRightMostLowestPoint = i;
                }
            }
        }

        return new double[]{points[indexOfRightMostLowestPoint][0], points[indexOfRightMostLowestPoint][1]};

    }
}
