import java.util.Scanner;

public class Ex6_37_FormatInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.print("Enter a width: ");
        int width = scanner.nextInt();

        System.out.println("The formated number is " + format(number, width));
    }

    public static String format(int number, int width) {
        String leadingZeros = "";
        if (getSize(number) > width) {
            return "" + number;
        } else {
            for (int i = 0; i < width - getSize(number); i++) {
                leadingZeros += "0";
            }
            return leadingZeros + number;
        }

    }

    public static int getSize(int number) {
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }

        return count;
    }
}
