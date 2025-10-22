import java.util.Scanner;

public class Ex5_28_DisplayFirstDay {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the year: ");
    int year = scanner.nextInt();

    System.out.print("Enter the day as a number(1 for Monday, 2 for Tuesday ... ): ");
    int dayNumber = scanner.nextInt();

    boolean isLeapYear = false;
    String dayName = "";

    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
      isLeapYear = true;
    }

    for (int i = 0; i < 12; i++) {

      dayNumber %= 7;

      if (dayNumber == 0) {
        dayNumber = 7;
      }

      switch (dayNumber) {
        case 1:
          dayName = "Monday";
          break;
        case 2:
          dayName = "Tuesday";
          break;
        case 3:
          dayName = "Wednesday";
          break;
        case 4:
          dayName = "Thursday";
          break;
        case 5:
          dayName = "Friday";
          break;
        case 6:
          dayName = "Saturday";
          break;
        case 7:
          dayName = "Sunday";
          break;
      }

      switch (i) {
        case 0 -> {
          System.out.println("January 1, " + year + " is " + dayName);
          dayNumber += 31;
        }
        case 1 -> {
          System.out.println("February 1, " + year + " is " + dayName);
          dayNumber += isLeapYear ? 29 : 28;
        }
        case 2 -> {
          System.out.println("March 1, " + year + " is " + dayName);
          dayNumber += 31;
        }
        case 3 -> {
          System.out.println("April 1, " + year + " is " + dayName);
          dayNumber += 30;
        }
        case 4 -> {
          System.out.println("May 1, " + year + " is " + dayName);
          dayNumber += 31;
        }
        case 5 -> {
          System.out.println("June 1, " + year + " is " + dayName);
          dayNumber += 30;
        }
        case 6 -> {
          System.out.println("July 1, " + year + " is " + dayName);
          dayNumber += 31;
        }
        case 7 -> {
          System.out.println("August 1, " + year + " is " + dayName);
          dayNumber += 31;
        }
        case 8 -> {
          System.out.println("September 1, " + year + " is " + dayName);
          dayNumber += 30;
        }
        case 9 -> {
          System.out.println("October 1, " + year + " is " + dayName);
          dayNumber += 31;
        }
        case 10 -> {
          System.out.println("November 1, " + year + " is " + dayName);
          dayNumber += 30;
        }
        case 11 -> {
          System.out.println("December 1, " + year + " is " + dayName);
          dayNumber += 31;
        }
      }
    }
  }
}
