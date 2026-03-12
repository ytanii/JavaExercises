import java.util.Arrays;
import java.util.Scanner;

public class Ex7_12_ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];
        System.out.print("Enter 10 numbers: ");
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(reverse(numbers)));
    }

    public static int[] reverse(int[] numbers){
        for(int i = 0, j = numbers.length - 1; i < numbers.length / 2; i++,j--){
            int helper = numbers[i];
            numbers [i] = numbers[j];
            numbers[j] = helper;
        }
        return numbers;
    }
}
