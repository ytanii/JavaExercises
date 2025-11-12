import java.util.Arrays;
import java.util.Scanner;

public class Ex9_06_Stopwatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = createArray();

        Stopwatch stopwatch = new Stopwatch();


        stopwatch.start();
        sort(array);
        stopwatch.stop();

        System.out.println("It took " + stopwatch.getEndTime() + " - " + stopwatch.getStartTime() + " = " + stopwatch.getElapsedTime() + " milliseconds to selection sort 100000 numbers");

    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int indexOfMin = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[indexOfMin] > array[j]) {
                    indexOfMin = j;
                }
            }
            int helper = array[i];
            array[i] = array[indexOfMin];
            array[indexOfMin] = helper;
        }

    }

    public static int[] createArray() {
        int[] array = new int[100000];

        for (int i = 0; i < 100000; i++) {
            array[i] = (int) (Math.random() * 100001);
        }

        return array;
    }
}
