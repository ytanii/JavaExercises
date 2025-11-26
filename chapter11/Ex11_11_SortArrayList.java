import java.util.ArrayList;
import java.util.Scanner;

public class Ex11_11_SortArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(scanner.nextInt());
        }

        sort(list);

        System.out.println(list);

    }

    public static void sort(ArrayList<Integer> list) {


        int j;
        for (int i = 0; i < list.size(); i++) {
            int minIndex = i;
            for (j = i + 1; j < list.size(); j++) {
                if (list.get(minIndex) > list.get(j)) {
                    minIndex = j;
                }
            }

            int helper = list.get(i);
            list.set(i, list.get(minIndex));
            list.set(minIndex, helper);

        }
    }
}
