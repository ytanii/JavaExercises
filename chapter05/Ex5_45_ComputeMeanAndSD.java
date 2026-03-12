import java.util.Scanner;

public class Ex5_45_ComputeMeanAndSD {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double number = 0, sum = 0, mean = 0, standardDeviation = 0, part = 0;

    System.out.print("Enter 10 numbers: ");

    for (int i = 0; i < 10; i++) {
      number = scanner.nextDouble();

      sum += number;

      part += Math.pow(number, 2);
    }

    mean = sum / 10.0;
    standardDeviation = Math.sqrt(((part) - (Math.pow(sum, 2) / 10.0)) / 9.0);
    System.out.println();

    System.out.println("The mean is " + mean);
    System.out.println("The sd is " + standardDeviation);
  }
}
