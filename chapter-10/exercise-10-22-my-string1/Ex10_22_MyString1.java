public class Ex10_22_MyString1 {
    public static void main(String[] args) {

        MyString1 s1 = new MyString1(new char[]{'H', 'e', 'l', 'l', 'o'});
        System.out.println(new String(s1.getChars()));
        System.out.println(s1.charAt(1));
        System.out.println(s1.length());

        MyString1 sub = s1.substring(1, 4);
        System.out.println(new String(sub.getChars()));

        MyString1 lower = s1.toLowerCase();
        System.out.println(new String(lower.getChars()));

        MyString1 s2 = new MyString1(new char[]{'H', 'e', 'l', 'l', 'o'});
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(lower));

        System.out.println(new String(MyString1.valueOf(12345).getChars()));
        System.out.println(new String(MyString1.valueOf(-987).getChars()));
        System.out.println(new String(MyString1.valueOf(0).getChars()));
    }
}
