import java.util.ArrayList;
import java.util.Scanner;

public class Listing11_09_DistinctNumbers {
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

        System.out.print("The distinct integers are: ");

        for (int i = 0; i < listOfIntegers.size(); i++) {
            System.out.print(listOfIntegers.get(i) + " ");

        }
    }
}
