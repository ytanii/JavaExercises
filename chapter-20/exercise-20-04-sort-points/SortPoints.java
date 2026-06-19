import java.awt.geom.Point2D;
import java.util.Arrays;
import java.util.Comparator;

public class SortPoints {
    public static void main(String[] args) {

        Point2D[] points = getHundredRandomPoints();
        Arrays.sort(points, Comparator.comparing(Point2D::getY).thenComparing(Point2D::getX));


        for (int i = 0; i < 5; i++) {
            System.out.println("(" + points[i].getX() + ", " + points[i].getY() + ")");
        }

    }

    public static Point2D[] getHundredRandomPoints() {
        Point2D[] points = new Point2D[100];
        for (int i = 0; i < 100; i++) {
            points[i] = new Point2D.Double(Math.random() * 100, Math.random() * 100);
        }

        return points;

    }
}
