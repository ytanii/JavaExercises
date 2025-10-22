import java.util.Scanner;

public class Ex6_36_RegularPolygonArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of sides: ");
        int numberOfSides = scanner.nextInt();
        System.out.print("Enter the side: ");
        double sideLength = scanner.nextDouble();
        System.out.println("The area of the polygon is " + area(numberOfSides, sideLength));
    }

    public static double area(int numberOfSides, double side) {
        return (numberOfSides * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / numberOfSides));
    }
}
