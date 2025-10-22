import java.util.Scanner;

public class Ex6_22_SqrtApprox {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = scanner.nextInt();

    System.out.println("The square root of " + number + " is " + sqrt(number));
  }

  public static double sqrt(long number) {
    final double EPSILON = 1e-15;
    double lastGuess = 1.0;
    double nextGuess = (lastGuess + number / lastGuess) / 2.0;
    while (Math.abs(lastGuess - nextGuess) > EPSILON) {
      lastGuess = nextGuess;
      nextGuess = (lastGuess + number / lastGuess) / 2.0;
    }

    return nextGuess;
  }
}
