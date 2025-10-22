import java.util.Scanner;

public class Ex6_24_CurrentDateTime {
    static int currentYear;
    static int currentMonth;
    static int currentDay;
    public static void main(String[] args) {

        System.out.println("The date and time is:");
        calculateDate();
        displayDate();
        displayCurrentTime();
    }

    public static void displayDate() {
        System.out.println(currentMonth + "/" + currentDay + "/" + currentYear);
    }

    public static void displayCurrentTime() {
        System.out.println(getTime());
    }

    public static void calculateDate() {
        long totalDays = System.currentTimeMillis() / 86400000L;

        int year = 1970;
        while (totalDays >= (isLeapYear(year) ? 366 : 365)) {
            totalDays -= isLeapYear(year) ? 366 : 365;
            year++;
        }
        currentYear = year;
        int daysInYear = (int) totalDays + 1;

        if (daysInYear <= 31) {
            currentMonth = 1;
            currentDay = daysInYear;

        } else if (daysInYear <= (isLeapYear(year) ? 60 : 59)) {
            currentMonth = 2;
            currentDay = daysInYear - 31;

        } else if (daysInYear <= (isLeapYear(year) ? 91 : 90)) {
            currentMonth = 3;
            currentDay = daysInYear - (isLeapYear(year) ? 60 : 59);

        } else if (daysInYear <= (isLeapYear(year) ? 121 : 120)) {
            currentMonth = 4;
            currentDay = daysInYear - (isLeapYear(year) ? 91 : 90);

        } else if (daysInYear <= (isLeapYear(year) ? 152 : 151)) {
            currentMonth = 5;
            currentDay = daysInYear - (isLeapYear(year) ? 121 : 120);

        } else if (daysInYear <= (isLeapYear(year) ? 182 : 181)) {
            currentMonth = 6;
            currentDay = daysInYear - (isLeapYear(year) ? 152 : 151);

        } else if (daysInYear <= (isLeapYear(year) ? 213 : 212)) {
            currentMonth = 7;
            currentDay = daysInYear - (isLeapYear(year) ? 182 : 181);

        } else if (daysInYear <= (isLeapYear(year) ? 244 : 243)) {
            currentMonth = 8;
            currentDay = daysInYear - (isLeapYear(year) ? 213 : 212);

        } else if (daysInYear <= (isLeapYear(year) ? 274 : 273)) {
            currentMonth = 9;
            currentDay = daysInYear - (isLeapYear(year) ? 244 : 243);

        } else if (daysInYear <= (isLeapYear(year) ? 305 : 304)) {
            currentMonth = 10;
            currentDay = daysInYear - (isLeapYear(year) ? 274 : 273);

        } else if (daysInYear <= (isLeapYear(year) ? 335 : 334)) {
            currentMonth = 11;
            currentDay = daysInYear - (isLeapYear(year) ? 305 : 304);

        } else {
            currentMonth = 12;
            currentDay = daysInYear - (isLeapYear(year) ? 335 : 334);

        }
    }

    public static String getTime() {
        long millis = System.currentTimeMillis();
        long totalSeconds = millis / 1000;
        long currentSeconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHours = totalHours % 24;

        // adjust for your own timezone (this is est)
        currentHours = (currentHours - 4 + 24) % 24;

        return String.format("%02d:%02d:%02d", currentHours, currentMinutes, currentSeconds);
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);


        
    }
}
