import java.util.Scanner;
import java.util.ArrayList;

public class Ex11_19_BinPacking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of objects: ");
        int numberOfObjects = scanner.nextInt();


        System.out.print("Enter the weights of the objects: ");

        int[] objects = new int[numberOfObjects];

        for (int i = 0; i < numberOfObjects; i++) {
            objects[i] = scanner.nextInt();

        }

        ArrayList<ArrayList<Integer>> bins = new ArrayList<>();
        bins.add(new ArrayList<>());

        boolean binFound = false;
        for (int i = 0; i < numberOfObjects; i++) {
            binFound = false;
            for (int k = 0; k < bins.size(); k++) {
                if ((sum(bins.get(k)) + objects[i]) <= 10) {
                    bins.get(k).add(objects[i]);
                    binFound = true;
                    break;
                }
            }
            if (!binFound) {
                bins.add(new ArrayList<>());
                bins.getLast().add(objects[i]);
            }


        }

        for (int i = 0; i < bins.size(); i++) {
            System.out.print("Container " + (i + 1) + " contains objects with weight ");
            for (int j = 0; j < bins.get(i).size(); j++) {
                System.out.print(bins.get(i).get(j) + " ");
            }
            System.out.println();

        }

    }

    public static int sum(ArrayList<Integer> list) {

        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }
}
