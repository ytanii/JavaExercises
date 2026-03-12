public class Ex6_12_PrintChars {
  public static void main(String[] args) {

    System.out.println(" i    m(i)");
    for (int i = 1; i <= 20; i++) {
      System.out.printf("%2d    %6.4f\n", i, m(i));
    }
  }

  public static double m(int i) {
    double sum = 0;
    for (int n = i; n > 0; n--) {
      sum += (n / (n + 1.0));
    }
    return sum;
  }
}
