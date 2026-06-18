import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex12_13_CountCharactersAndWords {
    public static void main(String[] args) {


        String fileName = args[0].trim();

        File file = new File(fileName);



        int wordCount = 0;
        int characterCount = 0;
        int lineCount = 0;
        try (Scanner scanner1 = new Scanner(file);
        Scanner scanner2 = new Scanner(file)) {
            while (scanner1.hasNext()) {
                String s = scanner1.next();
                wordCount++;
                characterCount += s.length();

            }

            while(scanner2.hasNextLine()){
                scanner2.nextLine();
                lineCount++;

            }

        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }

        System.out.println("File " + fileName + " has");
        System.out.println(characterCount + " characters");
        System.out.println(wordCount + " words");
        System.out.println(lineCount + " lines");

    }
}