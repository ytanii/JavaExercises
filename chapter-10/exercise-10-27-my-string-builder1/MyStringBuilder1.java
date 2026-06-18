public class MyStringBuilder1 {
    private String s;
    private char[] data;

    public MyStringBuilder1(String s) {
        this.s = s;
        data = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            data[i] = s.charAt(i);
        }
    }

    public MyStringBuilder1 append(MyStringBuilder1 s) {
        char[] charArray = new char[s.length() + this.s.length()];
        for (int i = 0; i < this.data.length; i++) {
            charArray[i] = data[i];
        }
        for (int i = this.data.length, n = 0; i < charArray.length; i++, n++) {
            charArray[i] = s.data[n];
        }

        return new MyStringBuilder1(String.valueOf(charArray));
    }

    public MyStringBuilder1 append(int i) {
        String s = String.valueOf(i);
        char[] charArray = new char[s.length() + this.s.length()];
        for (int j = 0; j < this.data.length; j++) {
            charArray[j] = this.data[j];
        }
        for (int j = this.data.length, n = 0; j < charArray.length; j++, n++) {
            charArray[j] = s.charAt(n);
        }
        return new MyStringBuilder1(String.valueOf(charArray));

    }

    public int length() {
        return this.data.length;
    }

    public char charAt(int index) {
        return this.data[index];
    }

    public MyStringBuilder1 toLowerCase() {
        char[] charArray = new char[this.data.length];
        for (int i = 0; i < this.data.length; i++) {
            if (this.data[i] >= 65 && this.data[i] <= 90) {
                charArray[i] = (char) (this.data[i] + 32);

            } else {
                charArray[i] = this.data[i];
            }

        }

        return new MyStringBuilder1(String.valueOf(charArray));
    }

    public MyStringBuilder1 substring(int begin, int end) {
        char[] charArray = new char[end - begin];
        for (int i = begin, n = 0; i < end; i++, n++) {
            charArray[n] = this.data[i];
        }
        return new MyStringBuilder1(String.valueOf(charArray));
    }

    @Override
    public String toString() {
        return String.valueOf(data);
    }

}
