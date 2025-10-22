import java.util.Scanner;

public class Ex5_40_HeadsOrTails {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int numberOfHeads = 0;
    int numberOfTails = 0;
    for (int i = 0; i < 1000000; i++) {
      int generatedNumber = (int) (Math.random() * 2);
      if (generatedNumber == 0) {
        numberOfHeads++;
      } else {
        numberOfTails++;
      }
    }

    System.out.println("Number of heads: " + numberOfHeads);
    System.out.println("Number of tails: " + numberOfTails);
  }
}
