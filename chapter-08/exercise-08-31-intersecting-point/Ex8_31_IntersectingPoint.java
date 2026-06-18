import java.util.Scanner;

public class Ex8_31_IntersectingPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 4 points for line1 and line2 as x1 y1 x2 y2: ");
        double[][] points = new double[4][2];
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = scanner.nextDouble();
            }
        }

        double[] intersectPoint = getIntersectingPoint(points);

        if (getIntersectingPoint(points) != null) {
            System.out.println("The intersecting point is at (" + intersectPoint[0] + ", " + intersectPoint[1] + ")");
        } else {
            System.out.println("The two lines are parallel");
        }

    }

    public static double[] getIntersectingPoint(double[][] points) {
        double[][] a = new double[2][2];
        double[] b = new double[2];
        a[0][0] = points[0][1] - points[1][1];
        a[0][1] = -(points[0][0] - points[1][0]);
        a[1][0] = points[2][1] - points[3][1];
        a[1][1] = -(points[2][0] - points[3][0]);
        b[0] = ((points[0][1] - points[1][1]) * points[0][0]) - ((points[0][0] - points[1][0]) * points[0][1]);
        b[1] = ((points[2][1] - points[3][1]) * points[2][0]) - ((points[2][0] - points[3][0]) * points[2][1]);


        if (linearEquation(a, b) == null) {
            return null;
        } else {
            return linearEquation(a, b);
        }
    }

    public static double[] linearEquation(double[][] a, double[] b) {
        double denominator = a[0][0] * a[1][1] - a[0][1] * a[1][0];
        if (denominator == 0) {
            return null;
        }
        double x = ((b[0] * a[1][1]) - (b[1] * a[0][1])) / denominator;
        double y = ((b[1] * a[0][0]) - (b[0] * a[1][0])) / denominator;
        return new double[]{x, y};
    }
}
