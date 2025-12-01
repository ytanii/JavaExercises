import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex12_16_ReplaceText {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        if (args.length != 3) {
            System.out.println("Usage: java ReplaceText sourceFile oldStr newStr");
            System.exit(1);

        }

        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("Source file " + args[0] + " does not exist");
            System.exit(2);
        }


        try (Scanner scanner = new Scanner(sourceFile)) {
            while (scanner.hasNextLine()) {
                list.add(scanner.nextLine());


            }
        } catch (Exception ex) {
            System.out.println("File not found");
        }

        try (PrintWriter output = new PrintWriter(sourceFile)) {
            for (int i = 0; i < list.size(); i++) {
                String s1 = list.get(i);
                String s2 = s1.replace(args[1], args[2]);
                output.println(s2);
            }

        } catch (Exception ex) {
            System.out.println("File error");
        }
    }
}
