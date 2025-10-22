import java.util.Scanner;

public class Ex5_01_CountPosAndNegNumbers {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double sum = 0;
    int numberOfNegatives = 0, numberOfPositives = 0, number = 0, count = 0;
    System.out.print("Enter an integer, (0 to exit): ");
    do {
      number = scanner.nextInt();

      if (number > 0) {
        numberOfPositives++;
      } else if (number < 0) {
        numberOfNegatives++;
      }
      if (number != 0) {
        sum += number;
        count++;
      }
    } while (number != 0);
    if (sum == 0) {
      System.out.println("No numbers are entered except 0");
    } else {
      System.out.println("The number of positives is " + numberOfPositives);
      System.out.println("The number of negatives is " + numberOfNegatives);
      System.out.println("The total is " + sum);
      System.out.println("The average is " + sum / count);
    }
  }
}
