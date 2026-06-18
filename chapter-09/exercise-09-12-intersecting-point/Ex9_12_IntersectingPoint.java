import javax.sound.sampled.Line;
import java.util.Scanner;

public class Ex9_12_IntersectingPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 4 endpoints as, x1 y1 x2 y2 x3 y3 x4 y4");

        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        double x4 = scanner.nextDouble();
        double y4 = scanner.nextDouble();

        double a = y1 - y2;
        double b = -(x1 - x2);
        double c = y3 - y4;
        double d = -(x3 - x4);
        double e = ((y1 - y2) * x1) - ((x1 - x2) * y1);
        double f = ((y3 - y4) * x3) - ((x3 - x4) * y3);

        LinearEquation equation = new LinearEquation(a, b, c, d, e, f);

        if (equation.isSolvable()) {
            System.out.println("The intersectin g point is at (" + equation.getX() + ", " + equation.getY() + ")");
        } else {
            System.out.println("The two lines are parallel");
        }
    }
}
