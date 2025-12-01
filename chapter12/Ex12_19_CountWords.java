import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Scanner;
import java.net.URL;
public class Ex12_19_CountWords {
    public static void main(String[] args) throws MalformedURLException, IOException {

        System.out.print("Enter a URL: ");
        String URLString = new Scanner(System.in).next();


        try{
            URL url = new URL(URLString);
            int count = 0;
            Scanner scanner = new Scanner(url.openStream());
            while(scanner.hasNext()){
                String word = scanner.next();
                count++;
            }

            System.out.println("The file has " + count + " words");
        }catch(MalformedURLException ex){
            System.out.println("Invalid URL");
        }catch (IOException ex){
            System.out.println("I/O Errors: no such file");
        }
    }
}
