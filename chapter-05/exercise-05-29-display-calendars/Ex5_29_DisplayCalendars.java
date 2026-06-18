import java.util.Scanner;

public class Ex5_29_DisplayCalendars {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the year: ");
    int year = scanner.nextInt();

    System.out.print("Enter the day as a number (1 for Monday, 2 for Tuesday ... ): ");
    int dayNumber = scanner.nextInt() - 1;

    boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

    for (int i = 0; i < 12; i++) {
      String monthName = "";
      int days = 0;

      switch (i) {
        case 0 -> {
          monthName = "January";
          days = 31;
        }
        case 1 -> {
          monthName = "February";
          days = isLeapYear ? 29 : 28;
        }
        case 2 -> {
          monthName = "March";
          days = 31;
        }
        case 3 -> {
          monthName = "April";
          days = 30;
        }
        case 4 -> {
          monthName = "May";
          days = 31;
        }
        case 5 -> {
          monthName = "June";
          days = 30;
        }
        case 6 -> {
          monthName = "July";
          days = 31;
        }
        case 7 -> {
          monthName = "August";
          days = 31;
        }
        case 8 -> {
          monthName = "September";
          days = 30;
        }
        case 9 -> {
          monthName = "October";
          days = 31;
        }
        case 10 -> {
          monthName = "November";
          days = 30;
        }
        case 11 -> {
          monthName = "December";
          days = 31;
        }
      }

      System.out.printf("%25s %d\n", monthName, year);
      System.out.printf("%22s\n", "---------------------------------------");
      System.out.printf("%5s%5s%5s%5s%5s%5s%5s\n", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");

      int offset = (dayNumber + 1) % 7;
      for (int k = 0; k < offset; k++) {
        System.out.print("     ");
      }

      for (int n = 1; n <= days; n++) {
        System.out.printf("%5d", n);
        if ((n + offset) % 7 == 0) {
          System.out.println();
        }
      }
      System.out.println();

      dayNumber = (dayNumber + days) % 7;
    }
  }
}
