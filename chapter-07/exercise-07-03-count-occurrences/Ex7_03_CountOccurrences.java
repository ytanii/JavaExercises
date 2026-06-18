import java.util.Scanner;

public class Ex7_03_CountOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] counts = new int[101];

        System.out.print("Enter the integers between 1 and 100: ");
        for (int i = 0; i < counts.length; i++) {
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            } else if (input > 100 || input < 0) {
                System.out.println("Enter an integer between 1 and 100");
                continue;
            }
            counts[input]++;
        }

        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                System.out.println(i + " occurs " + counts[i] + (counts[i] > 1 ? " times" : " time"));
            }
        }


    }

}
