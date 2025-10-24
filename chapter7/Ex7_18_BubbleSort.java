import java.util.Arrays;
import java.util.Scanner;

public class Ex7_18_BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double[] numbers = new double[10];

        System.out.println("Enter 10 doubles: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextDouble();
        }

        bubbleSort(numbers);

        System.out.println(Arrays.toString(numbers));


    }

    public static void bubbleSort(double[] numbers) {
        for (int j = 0; j < numbers.length - 1; j++) {
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    double helper = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = helper;
                }
            }
        }
    }
}
