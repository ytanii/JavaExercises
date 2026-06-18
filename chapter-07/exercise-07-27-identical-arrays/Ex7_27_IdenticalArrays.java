import java.util.Scanner;

public class Ex7_27_IdenticalArrays {
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


        if (equals(list1, list2)) {
            System.out.println("The two lists are identical");
        } else {
            System.out.println("The two lists are not identical");
        }

    }

    public static boolean equals(int[] list1, int[] list2) {
        if (list1.length != list2.length) {
            return false;
        }

        selectionSort(list1);
        selectionSort(list2);

        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]) {
                return false;
            }
        }

        return true;

    }

    public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
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