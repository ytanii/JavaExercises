import java.util.Scanner;

public class Ex2_05_Gratuity {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the subtotal ");
    double subTotal = scanner.nextDouble();

    System.out.println("Enter the gratuity rate");
    double gratuityRate = scanner.nextDouble();

    double extra = (gratuityRate / 100) * subTotal;

    System.out.println(
        "The gratuity is "
            + (gratuityRate / 100) * subTotal
            + " and the total is "
            + (subTotal + extra));
  }
}
