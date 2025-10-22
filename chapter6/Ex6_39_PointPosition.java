import java.util.Scanner;

public class Ex6_39_PointPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three points for p0, p1, and p2: ");
        double x0 = scanner.nextDouble();
        double y0 = scanner.nextDouble();

        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();


        // p2's coordinates are (x2,y2)
        if (leftOfTheLine(x0, y0, x1, y1, x2, y2)) {
            System.out.println("(" + x2 + ", " + y2 + ")" + " is on the left side of the line from " + "(" + x0 + ", " + y0 + ")" +" to " + "(" + x1 + ", " + y1 + ")");
        } else if (onTheLineSegment(x0, y0, x1, y1, x2, y2)) {
            System.out.println("(" + x2 + ", " + y2 + ")" + " is on the same line segment from " + "(" + x0 + ", " + y0 + ")" +" to " + "(" + x1 + ", " + y1 + ")");
        } else if (onTheSameLine(x0, y0, x1, y1, x2, y2)) {
            System.out.println("(" + x2 + ", " + y2 + ")" + " is on the same line from " + "(" + x0 + ", " + y0 + ")" +" to " + "(" + x1 + ", " + y1 + ")");
        } else {
            System.out.println("(" + x2 + ", " + y2 + ")" + " is on the right side of the line from " + "(" + x0 + ", " + y0 + ")" +" to " + "(" + x1 + ", " + y1 + ")");
        }


    }

    public static boolean leftOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2) {
        return ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)) > 0;

    }

    public static boolean onTheSameLine(double x0, double y0, double x1, double y1, double x2, double y2) {
        return ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)) == 0;


    }

    public static boolean onTheLineSegment(double x0, double y0, double x1, double y1, double x2, double y2) {
        if ((y2 < y1 && y2 > y0) && (x2 < x1 && x2 > x0)) {
            return ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)) == 0;
        } else {
            return false;
        }

    }
}
