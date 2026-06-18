import java.util.Scanner;

public class CalculateTips {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = scanner.nextDouble();
        double gratuity = scanner.nextDouble();

        double tip = subtotal * gratuity / 100;
        double total = subtotal + tip;

        System.out.println("The gratuity is $" + tip + " and total is $" + total);
    }
}
