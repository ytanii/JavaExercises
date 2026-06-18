import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class DisplayWords {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: DisplayWords filePath");
            System.exit(1);
        }

        try {
            File file = new File(args[0]);
            ArrayList<String> words = getWordsInAlphabeticalOrder(file);
            System.out.println(words);

        } catch (Exception ex) {
            System.out.println("File does not exist");
        }

    }

    public static ArrayList<String> getWordsInAlphabeticalOrder(File file) throws Exception {
        Scanner input = new Scanner(file);

        ArrayList<String> words = new ArrayList<>();

        while (input.hasNext()) {
            String token = input.next();
            if (Character.isLetter(token.charAt(0))) {
                String word = token.replaceAll("[^A-Za-z]", "");
                words.add(word.toLowerCase());
            }
        }

        words.sort(null);
        return words;
    }
}
