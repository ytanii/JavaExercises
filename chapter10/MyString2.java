public class MyString2 {
    private String s;

    public MyString2(String s) {
        this.s = s;
    }

    public int compare(String s) {
        for (int i = 0; i < (Math.min(s.length(), this.s.length())); i++) {
            if (this.s.charAt(i) > s.charAt(i)) {
                return this.s.charAt(i) - s.charAt(i);
            } else if (s.charAt(i) > this.s.charAt(i)) {
                return -(s.charAt(i) - this.s.charAt(i));
            }

        }
        if (s.length() > this.s.length()) {
            return -(s.length() - this.s.length());
        } else if (this.s.length() > s.length()) {
            return this.s.length() - s.length();
        }

        return 0;
    }

    public MyString2 substring(int begin) {
        StringBuilder s = new StringBuilder();
        for (int i = begin; i < this.s.length(); i++) {
            s.append(this.s.charAt(i));
        }
        return new MyString2(s.toString());
    }

    public MyString2 toUpperCase() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < this.s.length(); i++) {
            if (this.s.charAt(i) <= 122 && this.s.charAt(i) >= 97) {
                s.append((char) (this.s.charAt(i) - 32));
            } else {
                s.append(this.s.charAt(i));
            }

        }
        return new MyString2(s.toString());
    }

    public char[] toChars() {
        char[] charArray = new char[this.s.length()];
        for (int i = 0; i < this.s.length(); i++) {
            charArray[i] = this.s.charAt(i);
        }
        return charArray;
    }

    public static MyString2 valueOf(boolean b) {
        if (b) {
            return new MyString2("true");
        } else {
            return new MyString2("false");
        }
    }
}
