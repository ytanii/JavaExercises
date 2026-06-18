import java.util.Scanner;

public class Ex10_23_MyString2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyString2 string1  = new MyString2("hello");
        System.out.println(string1.substring(1).toChars());
        System.out.println(string1.toUpperCase().toChars());
        System.out.println(string1.compare("bello"));



    }
}
