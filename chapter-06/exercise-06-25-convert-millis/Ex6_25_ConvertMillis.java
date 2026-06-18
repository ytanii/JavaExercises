import java.util.Scanner;

public class Ex6_25_ConvertMillis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter milliseconds: ");
        long milliSeconds = scanner.nextLong();

        System.out.println(milliSeconds + " is " + convertMillis(milliSeconds));


    }

    public static String convertMillis(long millis) {
        long totalSeconds = millis / 1000;
        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;


        return totalHours + ":" + currentMinute + ":" + currentSecond;

    }
}
