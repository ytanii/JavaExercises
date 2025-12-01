import java.util.Scanner;
import java.util.ArrayList;

public class Ex11_15_AreaOfConvexPolygon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of points: ");
        int n = scanner.nextInt();

        double[][] points = new double[n + 1][2];

        System.out.println("Enter the coordinates of the points: ");
        for (int i = 0; i < n; i++) {
            points[i][0] = scanner.nextDouble();
            points[i][1] = scanner.nextDouble();
        }
        points[n][0] = points[0][0];
        points[n][1] = points[0][1];

        System.out.println("The total area is " + AreaOfPolygon(points));

    }

    public static double AreaOfPolygon(double[][] points) {
        double operand1 = 0;
        for (int i = 0, j = 1; i < points.length - 1; i++, j++) {
            operand1 += points[i][0] * points[j][1];
        }

        double operand2 = 0;
        for (int i = 0, j = 1; i < points.length - 1; i++, j++) {
            operand2 += points[i][1] * points[j][0];
        }

        return -((operand1 - operand2) / 2);

    }

}
