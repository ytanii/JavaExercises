import java.util.Scanner;

public class Ex10_14_MyDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MyDate d = new MyDate(561555550000L);
        MyDate d1 = new MyDate();

        System.out.println(d.getYear() + ", " + d.getMonth() + ", " + d.getDay());
        System.out.println(d1.getYear() + ", " + d1.getMonth() + ", " + d1.getDay());

    }
}
