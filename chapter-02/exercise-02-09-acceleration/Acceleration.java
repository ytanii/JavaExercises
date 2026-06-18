import java.util.Scanner;

public class Acceleration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter v0, v1, and t: ");
        double initialVelocity = scanner.nextDouble();
        double endingVelocity = scanner.nextDouble();
        double seconds = scanner.nextDouble();

        double acceleration = (endingVelocity - initialVelocity) / seconds;

        System.out.printf("The average acceleration is %.2f", acceleration);
    }
}
