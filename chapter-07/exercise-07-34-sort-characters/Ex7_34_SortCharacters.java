import java.util.Scanner;

public class Ex7_34_SortCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();


        System.out.println(sort(str));


    }

    public static String sort(String s) {
        char[] chars = new char[s.length()];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = s.charAt(i);
        }

        for (int i = 0; i < s.length() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < s.length(); j++) {
                if (chars[minIndex] > chars[j]) {
                    minIndex = j;
                }
            }

            int helper = chars[i];
            chars[i] = chars[minIndex];
            chars[minIndex] = (char) helper;

        }
        String newString = "";

        for (char x : chars) {
            newString += x;
        }

        return newString;
    }
}
