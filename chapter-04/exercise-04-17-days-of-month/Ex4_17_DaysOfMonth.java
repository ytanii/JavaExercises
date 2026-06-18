import java.util.Scanner;

public class Ex4_17_DaysOfMonth {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a year: ");
    int year = Integer.valueOf(scanner.nextLine());

    System.out.print("Enter a month: ");
    String monthName = scanner.nextLine();
    int numberOfDays = 0;

    if (Character.isUpperCase(monthName.charAt(0)) && monthName.length() <= 3) {
      if (monthName.equals("Jan")) {
        numberOfDays = 31;
      } else if (monthName.equals("Feb")) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
          numberOfDays = 29;
        } else {
          numberOfDays = 28;
        }
      } else if (monthName.equals("Mar")) {
        numberOfDays = 31;
      } else if (monthName.equals("Apr")) {
        numberOfDays = 30;
      } else if (monthName.equals("May")) {
        numberOfDays = 31;
      } else if (monthName.equals("Jun")) {
        numberOfDays = 30;
      } else if (monthName.equals("Jul")) {
        numberOfDays = 31;
      } else if (monthName.equals("Aug")) {
        numberOfDays = 31;
      } else if (monthName.equals("Sep")) {
        numberOfDays = 30;
      } else if (monthName.equals("Oct")) {
        numberOfDays = 31;
      } else if (monthName.equals("Nov")) {
        numberOfDays = 30;
      } else if (monthName.equals("Dec")) {
        numberOfDays = 31;
      }
      System.out.println(monthName + " " + year + " has " + numberOfDays + " days");

    } else {
      System.out.println(monthName + " is not a correct month name");
    }
  }
}
