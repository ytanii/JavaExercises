import java.util.Scanner;

public class Ex8_32_TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] points = new double[3][2];
        System.out.print("Enter x1 y1 x2 y2 x3 y3: ");

        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = scanner.nextDouble();
            }
        }

        double area = getTriangleArea(points);

        if (area > 0) {
            System.out.printf("The area of the triangle is %.2f", area);

        } else {
            System.out.println("The three points are on the same line. ");
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
}
