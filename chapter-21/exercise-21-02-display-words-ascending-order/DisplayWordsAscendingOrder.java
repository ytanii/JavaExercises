import java.io.File;
import java.util.Scanner;
import java.util.TreeSet;

public class DisplayWordsAscendingOrder {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println(
                "Usage: java DisplaysWordsAscendingOrder textFileName"
            );
            System.exit(1);
        }

        String fileName = args[0];

        File file = new File(fileName);

        try {
            System.out.println("File contents: ");
            printFileContents(file);

            System.out.println("\n\nDisplay words in ascending order");
            TreeSet<String> sortedSet = getSortedSet(file);
            sortedSet.forEach(word -> System.out.print(word + " "));
        } catch (Exception e) {
            System.out.println("File does not exist");
        }
    }

    public static void printFileContents(File file) throws Exception {
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        }
    }

    public static TreeSet<String> getSortedSet(File file) throws Exception {
        TreeSet<String> sortedSet = new TreeSet<>();

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                String word = scanner.next().replaceAll("[^a-zA-Z]", "");
                if (!word.isEmpty()) {
                    sortedSet.add(word);
                }
            }
        }

        return sortedSet;
    }
}
