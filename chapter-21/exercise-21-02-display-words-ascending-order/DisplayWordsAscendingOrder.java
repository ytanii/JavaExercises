import java.io.File;
import java.util.Scanner;
import java.util.TreeSet;

public class DisplayWordsAscendingOrder {

    public static void main(String[] args) {


        String fileName = args[0];

        File file = new File(fileName);

        try {
            System.out.println("File contents: ");
            printFileContents(file);

            System.out.println("\n\nDisplay words in ascending order");
            TreeSet<String> sortedSet = getSortedSet(file);
            sortedSet.forEach((String word) -> System.out.print(word + " "));
        } catch (Exception e) {
            System.out.println("File does not exist");
        }
    }

    public static void printFileContents(File file) throws Exception {
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            System.out.print(scanner.nextLine());
        }

        scanner.close();
    }

    public static TreeSet<String> getSortedSet(File file) throws Exception {
        Scanner scanner = new Scanner(file);
        TreeSet<String> sortedSet = new TreeSet<>();

        while (scanner.hasNext()) {
            String word = scanner.next();
            sortedSet.add(word);
        }

        scanner.close();

        return sortedSet;
    }
}
