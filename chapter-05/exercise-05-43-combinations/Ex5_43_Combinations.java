import java.util.Scanner;

public class Ex5_43_Combinations {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int count = 0;

    for (int i = 1; i <= 7; i++) {

      for (int n = i + 1; n <= 7; n++) {
        System.out.print(i + " " + n + "\n");
        count++;
      }
    }

    System.out.println("The total number of all combinations is " + count);
  }
}
