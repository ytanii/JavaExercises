import java.util.Scanner;

public class Ex7_19_IsSorted {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the list: ");
        int size = scanner.nextInt();

        int[] list = new int[size];

        System.out.print("Enter the contents of the list: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }

        System.out.print("The list has " + list.length + " integers ");

        for (int number : list) {
            System.out.print(number + " ");
        }

        System.out.println();

        System.out.println(isSorted(list) ? "The list is already sorted" : "The list is not sorted");

    }

    public static boolean isSorted(int[] list) {
        boolean isSorted = true;
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] > list[i + 1]) {
                isSorted = false;
                break;
            }

        }
        return isSorted;
    }
}
