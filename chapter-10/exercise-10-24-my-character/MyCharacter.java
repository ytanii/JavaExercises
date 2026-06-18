public class MyCharacter {
    private char c;


    public MyCharacter(char c) {
        this.c = c;
    }

    public int compareTo(char c) {
        return this.c - c;
    }

    public char charValue() {
        return this.c;
    }

    public static boolean isLetterOrDigit(char c) {
        return (c >= 48 && c <= 57) || (c >= 65 && c <= 90) || (c >= 97 && c <= 122);
    }

    public static boolean isLetter(char c) {
        return (c >= 65 && c <= 90) || (c >= 97 && c <= 122);
    }

    public static char toUpperCase(char c) {
        return (c >= 97 && c <= 122) ? (char) (c - 32) : c;

    }

    public static char toLowerCase(char c) {
        return (c >= 65 && c <= 90) ? (char) (c + 32) : c;

    }

    public static boolean isUpperCase(char c) {
        return (c >= 65 && c <= 90);
    }

    public static boolean isLowerCase(char c) {
        return (c >= 97 && c <= 122);
    }

    public static boolean isDigit(char c) {
        return (c >= 48 && c <= 57);
    }

}
