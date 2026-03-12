import java.util.Scanner;

public class Ex3_21_DayOfTheWeek {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter year: ");
    int year = scanner.nextInt();

    System.out.print("Enter month: 1-12 ");
    int monthNumber = scanner.nextInt();

    System.out.print("Enter the day of the month: 1-31 ");
    int dayNumber = scanner.nextInt();

    if ((monthNumber < 1 || monthNumber > 12) || (dayNumber < 1 || dayNumber > 31)) {
      System.out.println("Enter valid values.");
      return;
    }

    if (monthNumber == 1) {
      monthNumber = 13;
      year--;

    } else if (monthNumber == 2) {
      monthNumber = 14;
      year--;
    }

    int q = dayNumber;
    int m = monthNumber;
    int j = year / 100;
    int k = year % 100;
    String dayName = "";

    int dayOfTheWeek = (q + ((26 * (m + 1)) / 10) + k + k / 4 + j / 4 + (5 * j)) % 7;

    switch (dayOfTheWeek) {
      case 0:
        dayName = "Saturday";
        break;
      case 1:
        dayName = "Sunday";
        break;
      case 2:
        dayName = "Monday";
        break;
      case 3:
        dayName = "Tuesday";
        break;
      case 4:
        dayName = "Wednesday";
        break;
      case 5:
        dayName = "Thursday";
        break;
      case 6:
        dayName = "Friday";
        break;
    }

    System.out.println("Day of the week is " + dayName);
  }
}
