import java.util.Scanner;

public class Ex8_33_PolygonSubareas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x1 y1 x2 y2 x3 y3 x4 y4: ");
        double[][] points = new double[4][2];

        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = scanner.nextDouble();
            }
        }

        double[][] p = new double[4][2];
        p[0][0] = points[0][0];
        p[0][1] = points[0][1];
        p[1][0] = points[2][0];
        p[1][1] = points[2][1];
        p[2][0] = points[1][0];
        p[2][1] = points[1][1];
        p[3][0] = points[3][0];
        p[3][1] = points[3][1];

        double[] intersectionPoint = getIntersectingPoint(p);

        double[][] pointsForTriangle1 = {{points[0][0], points[0][1]}, {points[1][0], points[1][1]}, {intersectionPoint[0], intersectionPoint[1]}};
        double[][] pointsForTriangle2 = {{points[0][0], points[0][1]}, {points[3][0], points[3][1]}, {intersectionPoint[0], intersectionPoint[1]}};
        double[][] pointsForTriangle3 = {{points[2][0], points[2][1]}, {points[1][0], points[1][1]}, {intersectionPoint[0], intersectionPoint[1]}};
        double[][] pointsForTriangle4 = {{points[2][0], points[2][1]}, {points[3][0], points[3][1]}, {intersectionPoint[0], intersectionPoint[1]}};

        double[] areas = {getTriangleArea(pointsForTriangle1), getTriangleArea(pointsForTriangle2), getTriangleArea(pointsForTriangle3), getTriangleArea(pointsForTriangle4)};

        sort(areas);
        System.out.print("The areas are ");
        for (int i = 0; i < areas.length; i++) {
            System.out.printf("%.2f ", areas[i]);
        }

    }

    public static double getTriangleArea(double[][] points) {
        double s1 = getDistance(points[0][0], points[0][1], points[1][0], points[1][1]);
        double s2 = getDistance(points[0][0], points[0][1], points[2][0], points[2][1]);
        double s3 = getDistance(points[1][0], points[1][1], points[2][0], points[2][1]);

        double s = (s1 + s2 + s3) / 2;

        if ((s1 + s2) <= s3 || (s1 + s3) <= s2 || (s2 + s3) <= s1) {
            return 0;
        } else {
            return Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));

        }
    }

    public static double getDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
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

    public static void sort(double[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int indexOfMin = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[indexOfMin] > array[j]) {
                    indexOfMin = j;
                }


            }
            double helper = array[i];
            array[i] = array[indexOfMin];
            array[indexOfMin] = helper;
        }

    }
}



