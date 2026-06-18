import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex12_15_WriteReadData {
    public static void main(String[] args) {
        File file = new File("chapter12/Exercise12_15.txt");


        ArrayList<Integer> list = new ArrayList<>();


        try (PrintWriter output = new PrintWriter(file)) {
            for (int i = 0; i < 100; i++) {
                output.print(((int) (Math.random() * 100)) + " ");
            }
        } catch (Exception ex) {
            System.out.println("File not found");
        }

        try (
                Scanner scanner = new Scanner(file)
        ) {
            while (scanner.hasNextInt()) {
                list.add(scanner.nextInt());
            }


        } catch (Exception ex) {
            System.out.println("File not found");
        }

        for (int i = 0; i < list.size(); i++) {
            int minIndex = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(minIndex) > list.get(j)) {
                    minIndex = j;
                }
            }
            int helper = list.get(i);
            list.set(i, list.get(minIndex));
            list.set(minIndex, helper);
        }

        System.out.println(list);
    }
}
