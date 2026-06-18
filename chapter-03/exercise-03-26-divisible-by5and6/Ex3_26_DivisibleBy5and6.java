import java.util.Scanner;

public class Ex3_26_DivisibleBy5and6 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter an integer: ");
    int input = scanner.nextInt();

    System.out.println(
        "Is " + input + " Divisible by 5 and 6? " + (input % 5 == 0 && input % 6 == 0));

    System.out.println(
        "Is " + input + " Divisible by 5 or 6? " + (input % 5 == 0 || input % 6 == 0));

    System.out.println(
        "Is "
            + input
            + " Divisible by 5 and 6, but not both? "
            + (input % 5 == 0 ^ input % 6 == 0));
  }
}
