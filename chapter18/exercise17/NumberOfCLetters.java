import java.util.Scanner;

public class NumberOfCLetters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a list of characters then a character to count: ");
        String line = scanner.nextLine();
        char[] array = line.toCharArray();
        char c = scanner.nextLine().charAt(0);
        System.out.println("The number of "+ c +" is " + count(array,c));
    }

    public static int count(char[] chars, char c) {
        return count(chars, c,chars.length - 1);

    }

    public static int count(char[] chars,char c, int high) {
        if (high < 0) {
            return 0;
        } else {
            if (chars[high] == c) {
                return 1 + count(chars,c, high - 1);
            } else {
                return count(chars, c,high - 1);
            }
        }

    }

}
