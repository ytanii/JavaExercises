import java.util.Scanner;

public class Ex7_02_ReverseNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];

        System.out.print("Enter 10 integers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        reverse(numbers);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }


    }

    public static void reverse(int[] numbers) {
        for (int i = numbers.length - 1, j = 0; j < numbers.length / 2; i--, j++) {
            int helper = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = helper;
        }
    }
}
