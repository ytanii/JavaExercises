import java.util.Arrays;
import java.util.Scanner;

public class Ex7_32_PartitionList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] list = {5,2,9,3,6,8};


        partition(list);

        System.out.println(Arrays.toString(list));

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
