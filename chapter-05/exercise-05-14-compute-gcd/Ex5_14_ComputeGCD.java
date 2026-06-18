import java.util.Scanner;

public class Ex5_14_ComputeGCD {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter two positive integers separated by space: ");
    int number1 = scanner.nextInt();
    int number2 = scanner.nextInt();

    if (number2 > number1) {
      int helper = number1;
      number1 = number2;
      number2 = helper;
    }

    int d = number2;

    for (int i = 0; i < number1; i++) {
      if (number2 % (d - i) == 0 && number1 % (d - i) == 0) {
        System.out.println(
            "The greatest common divisor for " + number1 + " and " + number2 + " is " + (d - i));
        break;
      }
    }
  }
}
