import java.util.Scanner;

public class Ex7_30_IsConsecutiveFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of values: ");
        int[] numbers = new int[scanner.nextInt()];

        System.out.print("Enter the values: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        System.out.println((isConsecutiveFour(numbers) ? "The list has consecutive fours" : "The list has no consecutive fours"));

    }

    public static boolean isConsecutiveFour(int[] numbers) {
        int count = 0;

        for (int i = 1; i <= numbers.length - 1; i++) {

            if (numbers[i] == numbers[i - 1]) {
                count++;
                if (count == 3) {
                    return true;
                }
            } else {
                count = 0;
            }

        }
        return false;


    }
}
