import java.util.Scanner;

public class Ex5_07_CompareFutureTuition {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    final double INITIAL_TUITION = 10000;
    System.out.println("Initial tuition is " + INITIAL_TUITION);
    final double GROWTH_RATE = 0.05;
    double tuitionAfterTenYears = INITIAL_TUITION * Math.pow(1 + GROWTH_RATE, 10);
    double totalTuition = 0;

    for (int i = 1; i <= 4; i++) {
      totalTuition += tuitionAfterTenYears * (Math.pow(1 + GROWTH_RATE, i));
    }

    System.out.printf("Tuition after 10 years is %.2f \n", tuitionAfterTenYears);

    System.out.printf(
        "The total cost for four years of tuition after the 10th year  is %.2f", totalTuition);
  }
}
