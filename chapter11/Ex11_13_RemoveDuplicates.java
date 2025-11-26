import java.util.ArrayList;
import java.util.Scanner;

public class Ex11_13_RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter 10 integers: ");
        for (int i = 0; i < 10; i++) {
            list.add(scanner.nextInt());
        }

        removeDuplicate(list);

        System.out.println("The distinct integers are ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    public static void removeDuplicate(ArrayList<Integer> list) {
        boolean[] seen = new boolean[list.size()];
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (!seen[i]) {
                newList.add(list.get(i));
            }
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    seen[j] = true;
                    break;
                }
            }
        }

        list.clear();
        list.addAll(newList);

    }
}
