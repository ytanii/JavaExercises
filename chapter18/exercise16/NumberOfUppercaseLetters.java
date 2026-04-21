import java.util.Scanner;

public class NumberOfUppercaseLetters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a list of characters: ");
        String line = scanner.nextLine();
        char[] array = line.toCharArray();
        System.out.println("The number of uppercase letters is " + count(array));
    }

    public static int count(char[] chars) {
        return count(chars, chars.length - 1);

    }

    public static int count(char[] chars, int high) {
        if (high < 0) {
            return 0;
        } else {
            if (Character.isUpperCase(chars[high])) {
                return 1 + count(chars, high - 1);
            } else {
                return count(chars, high - 1);
            }
        }

    }

}
