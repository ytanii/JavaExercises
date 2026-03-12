import java.util.Scanner;

public class Ex6_34_PrintCalendar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter full year: ");
        int year = scanner.nextInt();

        System.out.print("Enter month as a number between 1 and 12: ");
        int month = scanner.nextInt();

        printMonth(year, month);
    }

    public static void printMonth(int year, int month) {

        printMonthTitle(year, month);

        printMonthBody(year, month);
    }

    public static void printMonthTitle(int year, int month) {
        if (getMonthName(month).equals("Invalid")) {
            System.out.println("Invalid month number");
            System.exit(1);
        }

        System.out.println("          " + getMonthName(month) + " " + year);
        System.out.println("-----------------------------");
        System.out.printf(
                "%3s %3s %3s %3s %3s %3s %3s\n", "Sun", "Mon", "Tues", "Wed", "Thu", "Fri", "Sat");
    }

    public static void printMonthBody(int year, int month) {

        if (getNumberOfDaysInMonth(year, month) == 0) {
            System.out.println("Invalid month number");
            System.exit(1);
        }

        int startDay = getStartDay(year, month);
        int numberOfDays = getNumberOfDaysInMonth(year, month);

        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }
        for (int day = 1; day <= numberOfDays; day++) {

            System.out.printf("%4d", day);

            if ((day + startDay) % 7 == 0) {
                System.out.println();
            }
        }

        System.out.println();
    }

    public static String getMonthName(int month) {
        return switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid";
        };
    }

    public static int getStartDay(int year, int month) {
        if (month == 1) {
            month = 13;
            year--;
        } else if (month == 2) {
            month = 14;
            year--;
        }
        int q = 1, m = month, j = year / 100, k = year % 100;
        int h = (q+((26*(m+1))/10)+k+k/4+j/4+5*j)%7;
        return (h+6)% 7;
    }

    public static int getNumberOfDaysInMonth(int year, int month) {

        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> isLeapYear(year) ? 29 : 28;
            default -> 0;
        };
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        }
        return false;
        
    }
}
