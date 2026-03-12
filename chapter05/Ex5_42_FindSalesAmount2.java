import java.util.Scanner;

public class Ex5_42_FindSalesAmount2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double totalEarnings = 5000;
    int sales = 0;

    System.out.print("What commission amount do you want: ");
    double COMMISSION_SOUGHT = scanner.nextDouble();

    for (sales = 0; totalEarnings < COMMISSION_SOUGHT; sales++) {
      if (sales <= 5000) {
        totalEarnings += 0.08;
      } else if (sales <= 10000) {
        totalEarnings += 0.1;
      } else {
        totalEarnings += 0.12;
      }
    }

    System.out.println("You need " + sales + " sales");
  }
}
