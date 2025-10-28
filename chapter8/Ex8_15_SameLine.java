import java.util.Scanner;

public class Ex8_15_SameLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter five points: ");
        double[][] points = readPoints();

        if (sameLine(points)) {
            System.out.println("The five points are on the same line ");
        } else {
            System.out.println("The five points are not on the same line");
        }
    }

    public static double[][] readPoints() {
        Scanner scanner = new Scanner(System.in);
        double[][] points = new double[5][2];
        for (int i = 0; i < points.length; i++) {
            points[i][0] = scanner.nextDouble();
            points[i][1] = scanner.nextDouble();
        }

        return points;
    }

    public static boolean sameLine(double[][] points) {
        for (int i = 0; i < points.length; i++) {
            if ((points[1][0] - points[0][0]) * (points[i][1] - points[0][1]) - (points[i][0] - points[0][0]) * (points[1][1] - points[0][1]) != 0) {
                return false;
            }
        }
        return true;
    }
}
