import java.util.Scanner;

public class Ex10_28_MyStringBuilder2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        MyStringBuilder2 a = new MyStringBuilder2("hello");
        MyStringBuilder2 b = new MyStringBuilder2(new char[]{'X', 'Y', 'Z'});

        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(a.reverse());

        a.insert(2, b);
        System.out.println(a.toString());

        MyStringBuilder2 c = a.substring(3);
        System.out.println(c.toString());

        a.reverse();
        System.out.println(a.toString());

        MyStringBuilder2 d = new MyStringBuilder2("mixedCase");
        d.toUpperCase();
        System.out.println(d.toString());

    }
}
