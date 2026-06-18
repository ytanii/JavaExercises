import java.util.Scanner;

public class PopulationProjection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SECONDS_IN_YEAR = 365 * 24 * 60 * 60;

        System.out.print("Enter number of years: ");
        int years = scanner.nextInt();

        System.out.printf("Seconds in year: %d", (int) (312032486 + (years * (SECONDS_IN_YEAR / 7.0 + SECONDS_IN_YEAR / 45.0 - SECONDS_IN_YEAR / 13.0))));
    }
}
