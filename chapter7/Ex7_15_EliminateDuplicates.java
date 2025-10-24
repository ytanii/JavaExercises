import java.util.Scanner;

public class Ex7_15_EliminateDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] list = new int[10];

        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }

        int[] noDuplicatesList = eliminateDuplicates(list);
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < noDuplicatesList.length; i++) {
            System.out.print(noDuplicatesList[i] + " ");
        }
    }

    public static int[] eliminateDuplicates(int[] list) {

        int[] nonDuplicateList = new int[list.length];
        int count = 0;
        for (int i = 0; i < list.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < count; j++) {
                if (list[i] == nonDuplicateList[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                nonDuplicateList[count] = list[i];
                count++;
            }
        }

        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = nonDuplicateList[i];
        }
        return result;

    }


}
