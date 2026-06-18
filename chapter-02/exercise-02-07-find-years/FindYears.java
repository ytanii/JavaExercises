import java.util.Scanner;

public class FindYears {
    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int MINUTES_IN_HOUR = 60;
        final int HOURS_IN_DAY = 24;
        final int DAYS_IN_YEAR = 365;
        System.out.print("Enter then number of minutes: ");
        int minutes = scanner.nextInt();

        int hours = minutes / MINUTES_IN_HOUR;
        int days = hours / HOURS_IN_DAY;
        int years = days / DAYS_IN_YEAR;
        int extra_days = days % 365;

        System.out.println(minutes + " minutes is approximately " + years + " years and " + extra_days + " days");
    }
}
