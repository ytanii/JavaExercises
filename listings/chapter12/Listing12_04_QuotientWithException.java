import java.util.Scanner;
public class Listing12_04_QuotientWithException {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two integers: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        try{
            int result = quotient(number1,number2);
            System.out.println(number1 + " / " + number2 + " is " + result);
        }catch(ArithmeticException ex){
            System.out.println("Exception: an integer cannot be divided by zero");
        }

        System.out.println("Execution continues");

    }

    public static int quotient(int number1, int number2) throws ArithmeticException{
        if(number2 == 0){
            throw new ArithmeticException("Divisor cannot be zero");
        }
        return number1 / number2;
    }

}
