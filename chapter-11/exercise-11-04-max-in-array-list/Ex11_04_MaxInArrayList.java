import java.util.ArrayList;
import java.util.Scanner;

public class Ex11_04_MaxInArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> listOfIntegers = new ArrayList<>();
        System.out.println("Enter integers (0 to quit): ");
        while (true) {
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            if (!listOfIntegers.contains(number)) {
                listOfIntegers.add(number);
            }
        }

        System.out.println("Max number: " + max(listOfIntegers));
    }

    public static Integer max(ArrayList<Integer> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }

        int max = list.getFirst();
        for (int i = 1; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }

        return max;
    }
}
