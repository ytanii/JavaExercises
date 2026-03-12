import java.util.Scanner;

public class Ex5_16_FindFactors {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter an integer: ");
    int number = scanner.nextInt();
    int product = 1;
    boolean first = true;

    for (int i = 1; i <= number; i++) {
      if (product == number) {
        break;
      }
      while (number % i == 0 && i != 1) {
        if (!first) {
          System.out.print(", ");
        }

        System.out.print(i);
        first = false;
        product *= i;
        number /= i;
      }
    }
  }
}
