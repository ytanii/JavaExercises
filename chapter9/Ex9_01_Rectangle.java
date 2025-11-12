import java.util.Scanner;

public class Ex9_01_Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Rectangle rectangle1 = new Rectangle(4,40);
        Rectangle rectangle2 = new Rectangle(3.5,35.9);

        System.out.println("rectangle1's width is " + rectangle1.getWidth() + " and it's height " + rectangle1.getHeight());
        System.out.println("rectangle1's area is " + rectangle1.getArea() + " and it's perimeter " + rectangle1.getPerimeter());

        System.out.println();

        System.out.println("rectangle2's width is " + rectangle2.getWidth() + " and it's height " + rectangle2.getHeight());
        System.out.println("rectangle2's area is " + rectangle2.getArea() + " and it's perimeter " + rectangle2.getPerimeter());

    }
}
