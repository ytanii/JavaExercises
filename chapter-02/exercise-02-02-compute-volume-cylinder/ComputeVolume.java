import java.util.Scanner;

public class ComputeVolume {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = scanner.nextDouble();
        double length = scanner.nextDouble();

        double area = radius * radius * Math.PI;
        double volume = area * length;

        System.out.printf("The area is %.2f\n", area);
        System.out.printf("The volume is %.2f\n", volume);
    }
}
