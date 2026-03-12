import java.util.Scanner;

public class Ex3_11_NumberOfDaysInAMonth {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a year: ");
    int year = scanner.nextInt();

    System.out.print("Enter a month number: ");
    int monthNumber = scanner.nextInt();

    String month = " ";
    int numberOfDays = 0;

    switch (monthNumber) {
      case 1:
        month = "January";
        numberOfDays = 31;
        break;
      case 2:
        month = "February";
        numberOfDays = 28;
        break;
      case 3:
        month = "March";
        numberOfDays = 31;
        break;
      case 4:
        month = "April";
        numberOfDays = 30;
        break;
      case 5:
        month = "May";
        numberOfDays = 31;
        break;
      case 6:
        month = "June";
        numberOfDays = 30;
        break;
      case 7:
        month = "July";
        numberOfDays = 31;
        break;
      case 8:
        month = "August";
        numberOfDays = 31;
        break;
      case 9:
        month = "September";
        numberOfDays = 30;
        break;
      case 10:
        month = "October";
        numberOfDays = 31;
        break;
      case 11:
        month = "November";
        numberOfDays = 30;
        break;
      case 12:
        month = "December";
        numberOfDays = 31;
        break;
      default:
        System.out.println("Invalid month number.");
        return;
    }

    if (((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) && numberOfDays == 28) {
      numberOfDays = 29;
    }

    System.out.println(month + " " + year + " has " + numberOfDays + " days");
  }
}
