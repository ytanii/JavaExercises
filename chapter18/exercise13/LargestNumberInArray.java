package exercise13;

import java.util.Scanner;

public class LargestNumberInArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an array of 8 integers: ");
        int[] arr = new int[8];
        for (int i = 0; i < 8; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(max(arr));
    }

    public static int max(int[] arr) {
        if (arr.length == 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return max(arr, arr.length - 1, Integer.MIN_VALUE);
    }

    public static int max(int[] arr, int high, int max) {
        if (arr[high] > max) {
            max = arr[high];
        }
        if (high == 0) {
            return max;
        }
        return max(arr, high - 1, max);
    }

}
