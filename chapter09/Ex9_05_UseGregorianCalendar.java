import java.util.GregorianCalendar;
import java.util.Scanner;

public class Ex9_05_UseGregorianCalendar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GregorianCalendar calendar = new GregorianCalendar();

        System.out.println(+calendar.get(GregorianCalendar.MONTH) + "/" + calendar.get(GregorianCalendar.DAY_OF_MONTH) + "/" + calendar.get(GregorianCalendar.YEAR));

        System.out.println();

        calendar.setTimeInMillis(1234567898765L);
        System.out.println(+calendar.get(GregorianCalendar.MONTH) + "/" + calendar.get(GregorianCalendar.DAY_OF_MONTH) + "/" + calendar.get(GregorianCalendar.YEAR));

    }
}
