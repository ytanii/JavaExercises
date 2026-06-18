import java.util.Date;
import java.util.Scanner;

public class Ex9_03_UseDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Date date = new Date();

        date.setTime(10000);
        System.out.println(date.toString());
        System.out.println();

        date.setTime(100000);
        System.out.println(date.toString());
        System.out.println();

        date.setTime(1000000);
        System.out.println(date.toString());
        System.out.println();

        date.setTime(10000000);
        System.out.println(date.toString());
        System.out.println();

        date.setTime(100000000);
        System.out.println(date.toString());
        System.out.println();

        date.setTime(1000000000);
        System.out.println(date.toString());
        System.out.println();

        date.setTime(10000000000L);
        System.out.println(date.toString());
        System.out.println();

        date.setTime(100000000000L);
        System.out.println(date.toString());
        System.out.println();


    }
}
