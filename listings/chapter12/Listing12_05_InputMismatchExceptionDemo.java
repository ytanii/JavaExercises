import java.util.InputMismatchException;
import java.util.Scanner;

public class Listing12_05_InputMismatchExceptionDemo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        boolean continueInput = true;

        do{
            try{
                System.out.print("Enter an integer: ");
                int number = scanner.nextInt();

                System.out.println("The number entered is " + number);

                continueInput = false;
            }catch (InputMismatchException ex){
                System.out.println("Try again. (Incorrect input an integer is required)");
                scanner.nextLine();
            }
        }while(continueInput);

    }
}
