package exercise10;

import java.util.Scanner;

import java.util.Scanner;

public class OccurrencesOfCharacter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string and a char that you want to count occurrences of in the string: ");
        String str = scanner.nextLine();
        char c = scanner.nextLine().charAt(0);
        System.out.println(c + " appears " + count(str, c) + " times in the string \"" + str + "\"");

    }

    public static int count(String str, char c) {
        return count(str, c, str.length() - 1);

    }

    public static int count(String str, char c, int high) {
        if (high < 0) {
            return 0;
        } else {
            if (str.charAt(high) == c) {
                return 1 + count(str, c, high - 1);
            } else {
                return count(str, c, high - 1);
            }
        }

    }

}
