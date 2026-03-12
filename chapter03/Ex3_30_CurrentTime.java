import java.util.Scanner;

public class Ex3_30_CurrentTime {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the time zone offset to GMT: ");
    int offset = scanner.nextInt();

    long milliSeconds = System.currentTimeMillis();

    long seconds = milliSeconds / 1000;
    long currentSecond = seconds % 60;

    long minutes = seconds / 60;
    long currentMinute = minutes % 60;

    long hours = minutes / 60;
    long currentHour = ((hours + offset) % 24 + 24) % 24;

    String midday;
    long displayHour;
    String zeroBeforeMinute = (currentMinute < 10) ? "0" : "";
    String zeroBeforeSecond = (currentSecond < 10) ? "0" : "";

    if (currentHour == 0) {
      displayHour = 12;
      midday = "AM";
    } else if (currentHour == 12) {
      displayHour = 12;
      midday = "PM";
    } else if (currentHour > 12) {
      displayHour = currentHour - 12;
      midday = "PM";
    } else {
      displayHour = currentHour;
      midday = "AM";
    }

    System.out.println(
        "The current time is "
            + displayHour
            + ":"
            + zeroBeforeMinute
            + currentMinute
            + ":"
            + zeroBeforeSecond
            + currentSecond
            + " "
            + midday);
  }
}
