import java.util.Scanner;

public class Ex10_04_MyPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyPoint point1 = new MyPoint();
        MyPoint point2 = new MyPoint(10, 30.5);

        System.out.println("The distance between point1 and point2 is " + MyPoint.distance(point1,point2));

    }
}
