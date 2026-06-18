import java.util.Scanner;

public class FindRunwayLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter speed and acceleration: ");
        double speed = scanner.nextDouble();
        double acceleration = scanner.nextDouble();

        double length = Math.pow(speed, 2) / (2 * acceleration);

        System.out.printf("The minimum runway length for this airplane is %.3f", length);
    }
}
