public class Ex6_14_EstimatePi {
  public static void main(String[] args) {
    System.out.println("  i      m(i)");
    for (int i = 1; i <= 901; i += 100) {
      System.out.printf("%3d      %2.4f\n", i, m(i));
    }
  }

  public static double m(int i) {
    double sum = 0;
    for (int n = i; n > 0; n--) {
      sum += (Math.pow(-1, n + 1)) / ((2 * n) - 1);
    }
    sum *= 4;
    return sum;
  }
}
