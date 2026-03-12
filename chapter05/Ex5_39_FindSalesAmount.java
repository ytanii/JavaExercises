import java.util.Scanner;

public class Ex5_39_FindSalesAmount {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double totalEarnings = 5000;
    int sales = 0;

    while (totalEarnings < 30000) {
      sales++;
      if (sales <= 5000) {
        totalEarnings += 1 * 0.08;
      } else if (sales <= 10000) {
        totalEarnings += 1 * 0.10;
      } else {
        totalEarnings += 1 * 0.12;
      }
    }

    System.out.println("Sales needed for 30k: " + sales);
  }
}
