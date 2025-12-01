import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
public class Listing12_13_WriteData {
    public static void main(String[] args) throws IOException {
        File file = new File("listings/chapter12/files/scores.txt");

        if(file.exists()){
            System.out.println("File exists");
            System.exit(1);
        }

        PrintWriter output = new PrintWriter(file);

        output.print("John T Smith ");
        output.println(90);
        output.print("Eric K Jones ");
        output.println(85);

        output.close();






    }
}
