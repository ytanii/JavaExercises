import java.util.Arrays;

public class MyString1 {
    private char[] chars;

    public MyString1(char[] chars) {
        this.chars = Arrays.copyOf(chars, chars.length);
    }

    public char[] getChars() {
        return Arrays.copyOf(chars, chars.length);
    }

    public char charAt(int index) {
        return this.chars[index];
    }

    public int length() {
        return this.chars.length;
    }

    public MyString1 substring(int begin, int end) {
        MyString1 s = new MyString1(new char[end - begin]);
        for (int i = begin; i < end; i++) {
            s.chars[i - begin] = this.chars[i];
        }
        return s;
    }

    public MyString1 toLowerCase() {
        MyString1 s = new MyString1(new char[this.chars.length]);
        for (int i = 0; i < s.length(); i++) {
            if (this.chars[i] <= 90 && this.chars[i] >= 65) {
                s.chars[i] = (char) (this.chars[i] + 32);
            } else {
                s.chars[i] = this.chars[i];
            }
        }

        return s;
    }

    public boolean equals(MyString1 s) {
        if (this.length() != s.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (this.chars[i] != s.chars[i]) {
                return false;
            }
        }
        return true;

    }

    public static MyString1 valueOf(int i) {
        boolean negative = i < 0;
        int num = negative ? -i : i;

        char[] tmp = new char[12];
        int count = 0;

        if (num == 0) {
            tmp[count++] = '0';
        } else {
            while (num > 0) {
                int digit = num % 10;
                tmp[count++] = (char) ('0' + digit);
                num /= 10;
            }
        }

        if (negative) {
            tmp[count++] = '-';
        }

        char[] result = new char[count];
        for (int x = 0; x < count; x++) {
            result[x] = tmp[count - 1 - x];
        }

        return new MyString1(result);
    }

}
