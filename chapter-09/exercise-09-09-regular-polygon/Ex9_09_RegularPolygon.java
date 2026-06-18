import java.util.Scanner;

public class Ex9_09_RegularPolygon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        RegularPolygon polygon1 = new RegularPolygon();
        RegularPolygon polygon2 = new RegularPolygon(6,4);
        RegularPolygon polygon3 = new RegularPolygon(10,4,5.6,7.8);

        System.out.println("polygon1: perimeter = " + polygon1.getPerimeter()  + ", area = " + polygon1.getArea());
        System.out.println("polygon2: perimeter = " + polygon2.getPerimeter()  + ", area = " + polygon2.getArea());
        System.out.println("polygon3: perimeter = " + polygon3.getPerimeter()  + ", area = " + polygon3.getArea());

    }
}
