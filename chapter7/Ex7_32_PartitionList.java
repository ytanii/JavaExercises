import java.util.Arrays;
import java.util.Scanner;

public class Ex7_32_PartitionList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter list size: ");

        int[] list = new int[scanner.nextInt()];



        System.out.print("Enter list content: ");
        for(int i = 0; i < list.length; i++){
            list[i] = scanner.nextInt();
        }

        partition(list);

        System.out.print("After the partition, the list is ");
        for(int i = 0; i < list.length; i++){
            System.out.print(list[i] + " ");
        }

    }

    public static int partition(int[] list){
        int pivot = list[0];

        int high = list.length-1;
        int low  = 1;

        while (low <= high) {
            while (low <= high && list[low] <= pivot) {
                low++;
            }
            while (low <= high && list[high] > pivot) {
                high--;
            }
            if (low < high) {
                int temp = list[low];
                list[low] = list[high];
                list[high] = temp;
                low++;
                high--;
            }
        }

        list[0] = list[high];
        list[high] = pivot;

        return high;
    }
}
