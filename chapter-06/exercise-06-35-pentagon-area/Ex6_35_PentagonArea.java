import java.util.Scanner;

public class Ex6_35_PentagonArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side: ");
        System.out.println("The area of the pentagon is " + area(scanner.nextDouble()));

    }

    public static double area(double side) {
        return (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5));
    }
}
