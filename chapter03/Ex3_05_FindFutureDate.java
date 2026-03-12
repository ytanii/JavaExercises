import java.util.Scanner;

public class Ex3_05_FindFutureDate {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter today's day: ");
    int dayNumber;

    while (true) {
      dayNumber = scanner.nextInt();
      if (dayNumber >= 0 && dayNumber <= 6) {
        break;
      } else {
        System.out.println("Please enter a valid day number");
        continue;
      }
    }

    System.out.print("Enter the number of days elapsed since today: ");
    int futureDayNumber = scanner.nextInt() + dayNumber;

    if (futureDayNumber > 6) {
      futureDayNumber %= 7;
    }

    String day = " ";
    String futureDay = " ";

    switch (futureDayNumber) {
      case 0:
        futureDay = "Sunday";
        break;
      case 1:
        futureDay = "Monday";
        break;
      case 2:
        futureDay = "Tuesday";
        break;
      case 3:
        futureDay = "Wednesday";
        break;
      case 4:
        futureDay = "Thursday";
        break;
      case 5:
        futureDay = "Friday";
        break;
      case 6:
        futureDay = "Saturday";
        break;
    }

    switch (dayNumber) {
      case 0:
        day = "Sunday";
        break;
      case 1:
        day = "Monday";
        break;
      case 2:
        day = "Tuesday";
        break;
      case 3:
        day = "Wednesday";
        break;
      case 4:
        day = "Thursday";
        break;
      case 5:
        day = "Friday";
        break;
      case 6:
        day = "Saturday";
        break;
    }

    System.out.println("Today is " + day + " and the future day is " + futureDay);
  }
}
