import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex12_12_ReformatJavaCode {
    public static void main(String[] args){
        String fileName = args[0].trim();


        File file = new File(fileName);


        ArrayList<String> originalFile = new ArrayList<>();


        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                originalFile.add(scanner.nextLine());
            }


            try (PrintWriter output = new PrintWriter(file)) {
                for (int i = 0; i < originalFile.size(); i++) {
                    String s1 = originalFile.get(i);
                    if(i != originalFile.size() - 1 &&originalFile.get(i+1).trim().equals("{")){
                        s1 += " {";
                    }


                    if(!s1.trim().equals("{")){
                        output.println(s1);
                    }
                }
            }

        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }





    }
}
