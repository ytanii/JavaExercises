import java.util.Scanner;

public class Listing07_07_BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = {1, 2, 5, 7, 15, 23, 31, 64, 100, 120};
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        System.out.print("Find: ");
        int key = scanner.nextInt();

        if(binarySearch(numbers, key) >= 0){
            System.out.println(key + " was found at " + binarySearch(numbers,key));
        }


    }

    public static int binarySearch(int[] numbers, int key) {
        int low = 0;
        int high =numbers.length-1;

        while(low <= high){
            int mid = (low + high) / 2;
            if (numbers[mid] == key) {
                return mid;
            }

            if (key < numbers[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -low - 1;

    }
}
