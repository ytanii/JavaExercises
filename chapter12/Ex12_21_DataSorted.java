import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex12_21_DataSorted {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        File file = new File("chapter12/SortedStrings.txt");
        try (Scanner scanner = new Scanner(file)) {

            while (scanner.hasNext()) {
                list.add(scanner.next());
            }

            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i).compareTo(list.get(i + 1)) > 0) {
                    System.out.println(list.get(i) + " and " + list.get(i + 1));
                    break;
                }
            }

        } catch (Exception ex) {
            System.out.println("File not found");
        }


    }
}
