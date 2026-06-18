package exercise14;

import java.util.Scanner;

public class CountUpperCaseLetters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();

        System.out.println(numberOfUpperCaseLetters(str));

    }

    public static int numberOfUpperCaseLetters(String str) {
        return numberOfUpperCaseLetters(str, str.length() - 1);


    }

    public static int numberOfUpperCaseLetters(String str, int high) {
        if (high < 0) {
            return 0;
        }

        if (Character.isUpperCase(str.charAt(high))) {
            return 1 + numberOfUpperCaseLetters(str, high - 1);
        } else {
            return numberOfUpperCaseLetters(str, high - 1);
        }

    }

}
