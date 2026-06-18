import java.util.Scanner;

public class ShowCurrentTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long totalCurrentMillis = System.currentTimeMillis();

        System.out.print("Enter the time zone offset to GMT: ");
        int offsetHour = scanner.nextInt();
        int offsetSeconds = offsetHour * 60 * 60;


        long totalCurrentSeconds = (totalCurrentMillis / 1000) + offsetSeconds;
        long totalCurrentMinutes = totalCurrentSeconds / 60;
        long totalCurrentHours = totalCurrentMinutes / 60;

        int currentSeconds = (int) (totalCurrentSeconds % 60);
        int currentMinutes = (int) (totalCurrentMinutes % 60);
        int currentHours = (int) (totalCurrentHours % 24);

        System.out.printf("The current time is %d:%02d:%02d", currentHours, currentMinutes, currentSeconds);
    }
}
