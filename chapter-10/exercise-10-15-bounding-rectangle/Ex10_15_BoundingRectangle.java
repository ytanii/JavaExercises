import java.util.Scanner;

public class Ex10_15_BoundingRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] points = new double[5][2];
        System.out.print("Enter five points: ");

        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = scanner.nextDouble();
            }
        }

        MyRectangle2D rectangle = MyRectangle2D.getRectangle(points);

        System.out.println("The bounding rectangle's center (" + rectangle.getX() + ", " + rectangle.getY() + "), width " + rectangle.getWidth() + ", height " + rectangle.getHeight());


    }
}
