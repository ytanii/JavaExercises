import java.util.Arrays;
import java.util.Scanner;

public class Ex10_25_Split {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(Arrays.toString(split("abc#def#ghi", "#")));
        System.out.println(Arrays.toString(split("apple,banana,pear", ",")));
        System.out.println(Arrays.toString(split("one|two|three", "|")));
        System.out.println(Arrays.toString(split("x1y2z3", "[123]")));
    }

    public static String[] split(String s, String regex) {
        String[] parts = new String[s.length()];
        String str = "";
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            boolean matched = false;

            for (int j = (regex.length() > 1 ? 1 : 0); j < (regex.length() > 1 ? regex.length() - 1 : 1); j++) {
                if (s.charAt(i) == regex.charAt(j)) {
                    if (str.length() > 0) {
                        parts[n++] = str;
                        str = "";
                    }
                    parts[n++] = String.valueOf(regex.charAt(j));
                    matched = true;
                    break;
                }
            }
            if (!matched) {
                str += s.charAt(i);
            }
            if (i == s.length() - 1 && str.length() > 0) {
                parts[n++] = str;
            }

        }

        String[] newParts = new String[n];

        for (int i = 0; i < n; i++) {
            newParts[i] = parts[i];

        }
        return newParts;

    }
}
