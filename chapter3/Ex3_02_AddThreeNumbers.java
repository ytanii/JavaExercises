import java.util.Scanner;

public class Ex3_02_AddThreeNumbers {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int first = (int) (Math.random() * 10);
    int second = (int) (Math.random() * 10);
    int third = (int) (Math.random() * 10);

    System.out.print("What is the sum of " + first + ", " + second + ", " + third + " ");
    int answer = scanner.nextInt();

    if ((first + second + third) == answer) {
      System.out.println(
          "You answered correctly " + first + " + " + second + " + " + third + " = " + answer);
    } else {
      System.out.println(
          "You answered incorrectly "
              + first
              + " + "
              + second
              + " + "
              + third
              + " is "
              + (first + second + third)
              + " not "
              + answer);
    }
  }
}
