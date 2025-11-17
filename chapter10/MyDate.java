public class MyDate {
    private int year;
    private int month;  // 0-based (Jan = 0)
    private int day;

    public MyDate() {
        setDate(System.currentTimeMillis());
    }

    public MyDate(long elapsedTime) {
        setDate(elapsedTime);
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setDate(long elapsedTime) {
        long totalDays = elapsedTime / 86400000;

        int y = 1970;
        while (totalDays >= daysInYear(y)) {
            totalDays -= daysInYear(y);
            y++;
        }
        this.year = y;

        int[] monthLengths = {
                31, isLeapYear(y) ? 29 : 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31
        };

        int m = 0;
        while (totalDays >= monthLengths[m]) {
            totalDays -= monthLengths[m];
            m++;
        }
        this.month = m;
        this.day = (int) totalDays + 1;
    }

    private boolean isLeapYear(int y) {
        return (y % 400 == 0) || (y % 4 == 0 && y % 100 != 0);
    }

    private int daysInYear(int y) {
        return isLeapYear(y) ? 366 : 365;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
}