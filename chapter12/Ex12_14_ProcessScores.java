import java.io.File;
import java.util.Scanner;

public class Ex12_14_ProcessScores {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter filename: ");
        String fileName = input.nextLine();
        File file = new File(fileName);

        int count = 0;
        double total = 0;
        try(Scanner scanner = new Scanner(file)){
            while (scanner.hasNextInt()){
                total += scanner.nextInt();
                count++;
            }
            System.out.println("The total of the scores is " + total);
            System.out.println("The average score is " + (total / count));
        }catch (Exception ex){
            System.out.println("File not found");
        }


    }
}
