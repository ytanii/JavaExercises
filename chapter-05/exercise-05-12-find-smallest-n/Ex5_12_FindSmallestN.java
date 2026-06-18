import java.util.Scanner;

public class Ex5_12_FindSmallestN {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int number = 0;

    while (Math.pow(number, 2) < 12000) {
      number++;
    }
    System.out.println(number);
  }
}
