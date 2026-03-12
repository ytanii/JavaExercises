import java.util.Arrays;
import java.util.Scanner;

public class Ex7_16_ExecutionTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] integers = new int[100000];

        for (int i = 0; i < integers.length; i++) {
            integers[i] = (int) (Math.random() * 100000);

        }

        int key = (int) (Math.random() * 100000);


        long startTime2 = System.nanoTime();
        int location2 = linearSearch(integers, key);
        System.out.println(key + (location2 > 0 ? " was found at " + location2 : " was not found"));
        long endTime2 = System.nanoTime();

        Arrays.sort(integers);
        long startTime = System.nanoTime();
        int location = Arrays.binarySearch(integers, key);
        System.out.println(key + (location > 0 ? " was found at " + location : " was not found"));
        long endTime = System.nanoTime();


        long executionTime = endTime - startTime;
        long executionTime2 = endTime2 - startTime2;

        System.out.println("linear search: " + executionTime2);
        System.out.println("binary search: " + executionTime);


    }

    public static int linearSearch(int[] integers, int key) {
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] == key) {
                return i;
            }
        }
        return -1;

    }

}