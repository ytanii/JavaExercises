import java.util.Scanner;

public class Ex6_05_SortThreeNumbers {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter 3 numbers: ");
    double number1 = scanner.nextDouble();
    double number2 = scanner.nextDouble();
    double number3 = scanner.nextDouble();

    displaySortedNumber(number1, number2, number3);
  }

  public static void displaySortedNumber(double number1, double number2, double number3) {
    if (number1 > number2) {
      double helper = number1;
      number1 = number2;
      number2 = helper;
    }
    if (number2 > number3) {
      double helper = number2;
      number2 = number3;
      number3 = helper;
    }
    if (number1 > number2) {
      double helper = number1;
      number1 = number2;
      number2 = helper;
    }

    System.out.printf("%.1f, %.1f, %.1f\n", number1, number2, number3);
  }
}
