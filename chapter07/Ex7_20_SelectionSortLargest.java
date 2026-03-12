import java.util.Arrays;
import java.util.Scanner;

public class Ex7_20_SelectionSortLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbers = new double[10];
        System.out.println("Enter 10 doubles: ");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextDouble();
        }

        System.out.println();


        selectionSort(numbers);

        System.out.println(Arrays.toString(numbers));

    }

    public static void selectionSort(double[] numbers) {
        for (int i = numbers.length - 1; i >= 0; i--) {
            int maxIndex = i;
            for (int j = i - 1; j >= 0; j--) {
                if (numbers[maxIndex] < numbers[j]) {
                    maxIndex = j;
                }
            }

            double helper = numbers[i];
            numbers[i] = numbers[maxIndex];
            numbers[maxIndex] = helper;

        }
    }
}
