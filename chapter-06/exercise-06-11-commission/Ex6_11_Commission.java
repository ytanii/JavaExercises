public class Ex6_11_Commission {
  public static void main(String[] args) {
    System.out.println("Sales Amount       Commission");

    for (int i = 10000; i <= 100000; i += 5000) {
      System.out.printf("%-15d%11.1f\n", i, computeCommission(i));
    }
  }

  public static double computeCommission(double salesAmount) {
    double commission = 0;
    for (int i = 1; i <= salesAmount; i++) {
      if (i <= 5000) {
        commission += 0.08;

      } else if (i <= 10000) {
        commission += 0.1;
      } else {
        commission += 0.12;
      }
    }
    return commission;
  }
}
