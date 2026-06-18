import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex12_11_RemoveText {
    public static void main(String[] args) {

        String stringToBeRemoved = args[0].trim();
        String fileName = args[1].trim();

        File file = new File(fileName);


        ArrayList<String> originalFile = new ArrayList<>();


        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                originalFile.add(scanner.nextLine());
            }


            try (PrintWriter output = new PrintWriter(file)) {
                for (int i = 0; i < originalFile.size(); i++) {
                    String s1 = originalFile.get(i);
                    String s2 = s1.replaceAll(stringToBeRemoved, "");
                    output.println(s2);

                }
            }

        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
    }
}
