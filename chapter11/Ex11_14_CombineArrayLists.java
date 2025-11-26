import java.util.ArrayList;
import java.util.Scanner;

public class Ex11_14_CombineArrayLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.print("Enter five integers for list1: ");
        for (int i = 0; i < 5; i++) {
            list1.add(scanner.nextInt());
        }
        System.out.print("Enter five integers for list2: ");
        for (int i = 0; i < 5; i++) {
            list2.add(scanner.nextInt());
        }

        ArrayList<Integer> unionList = union(list1, list2);

        System.out.println("The combined list is ");
        for (int i = 0; i < unionList.size(); i++) {
            System.out.print(unionList.get(i) + " ");
        }


    }


    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> unionList = new ArrayList<>();
        unionList.addAll(list1);
        unionList.addAll(list2);
        return unionList;
    }
}
