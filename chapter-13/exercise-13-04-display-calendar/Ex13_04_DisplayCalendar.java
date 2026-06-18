import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ex13_04_DisplayCalendar {
    static GregorianCalendar calendar = new GregorianCalendar();

    public static void main(String[] args) {
        int month = calendar.get(Calendar.MONTH) + 1;
        int year = calendar.get(Calendar.YEAR);

        if (args.length > 2) {
            System.out.println("Usage java Exercise13_04 month year");
            return;
        } else if (args.length == 2) {
            year = Integer.parseInt(args[1].trim());
            month = Integer.parseInt(args[0].trim());
        } else if (args.length == 1) {
            month = Integer.parseInt(args[0]);
        }

        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);

        calendar.set(Calendar.DATE, 1);

        printMonth(year, month);
    }

    static void printMonth(int year, int month) {
        int startDay = getStartDay();

        int numOfDaysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        printMonthTitle(year, month);

        printMonthBody(startDay, numOfDaysInMonth);
    }


    static int getStartDay() {
        return calendar.get(Calendar.DAY_OF_WEEK);
    }

    static void printMonthBody(int startDay, int numOfDaysInMonth) {
        int i = 0;

        for (i = 0; i < startDay - 1; i++) {
            System.out.print("    ");
        }

        for (i = 1; i <= numOfDaysInMonth; i++) {
            if (i < 10)
                System.out.print("   " + i);
            else
                System.out.print("  " + i);

            if ((i + startDay - 1) % 7 == 0)
                System.out.println();
        }

        System.out.println("");
    }

    static void printMonthTitle(int year, int month) {
        System.out.println("         " + getMonthName(calendar.get(Calendar.MONTH)) + " " + year);
        System.out.println("-----------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }

    public static String getMonthName(int month) {
        String[] months = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };

        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Invalid month number");
        }

        return months[month - 1];
    }
}
