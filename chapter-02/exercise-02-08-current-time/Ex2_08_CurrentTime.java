import java.util.Scanner;

public class Ex2_08_CurrentTime {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the time zone offset to GMT: ");
    int timezoneOffset = scanner.nextInt();

    long milliseconds = System.currentTimeMillis();

    long seconds = milliseconds / 1000;
    long currentSecond = seconds % 60;

    long minutes = seconds / 60;
    long currentMinute = minutes % 60;

    long hours = minutes / 60;
    long currentHour = hours % 24;

    System.out.println(
        "The current time is "
            + (currentHour + timezoneOffset)
            + ":"
            + currentMinute
            + ":"
            + currentSecond);
  }
}
