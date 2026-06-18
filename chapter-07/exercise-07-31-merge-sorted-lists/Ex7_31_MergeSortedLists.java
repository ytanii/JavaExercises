import java.util.Scanner;

public class Ex7_31_MergeSortedLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter list1 size and contents: ");
        int[] list1 = new int[scanner.nextInt()];

        for (int i = 0; i < list1.length; i++) {
            list1[i] = scanner.nextInt();
        }

        System.out.print("Enter list2 size and contents: ");
        int[] list2 = new int[scanner.nextInt()];

        for (int i = 0; i < list2.length; i++) {
            list2[i] = scanner.nextInt();
        }

        sort(list1);
        sort(list2);

        System.out.print("list1 is ");
        for (int number : list1) {
            System.out.print(number + " ");
        }

        System.out.println();

        System.out.print("list2 is ");
        for (int number : list2) {
            System.out.print(number + " ");
        }

        System.out.println();

        int[] mergedArray = merge(list1, list2);
        System.out.print("The merged list is ");
        for (int number : mergedArray) {
            System.out.print(number + " ");
        }
    }

    public static int[] merge(int[] list1, int[] list2) {
        int mergeArraySize = list1.length + list2.length;
        int[] mergedArray = new int[mergeArraySize];

        int k = 0;
        int i = 0, j = 0;
        while (i < list1.length && j < list2.length) {
            if (list1[i] > list2[j]) {
                mergedArray[k++] = list2[j++];

            } else {
                mergedArray[k++] = list1[i++];

            }

        }

        while (i < list1.length) mergedArray[k++] = list1[i++];
        while (j < list2.length) mergedArray[k++] = list2[j++];

        return mergedArray;

    }

    public static void sort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[minIndex] > list[j]) {
                    minIndex = j;
                }
            }
            int helper = list[i];
            list[i] = list[minIndex];
            list[minIndex] = helper;

        }
    }
}
