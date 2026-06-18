import java.util.Scanner;

public class HexagonArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the side: ");
        double length = scanner.nextDouble();

        double area = ((3 * Math.pow(3, 0.5)) / 2) * (length * length);

        System.out.printf("The area of the hexagon is %.4f", area);
    }
}
