import java.util.Scanner;

public class Ex10_27_MyStringBuilder1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MyStringBuilder1 stringBuilder1 = new MyStringBuilder1("hello");
        System.out.println(stringBuilder1.append(67));
        System.out.println(stringBuilder1.append(new MyStringBuilder1(" world!")));
        System.out.println(stringBuilder1.substring(2, 5));
        System.out.println(stringBuilder1.length());
        System.out.println(stringBuilder1.charAt(3));

    }
}
