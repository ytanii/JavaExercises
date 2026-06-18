public class Ex6_13_SumSeries {
  public static void main(String[] args) {
    printChars('1', 'Z', 10);
  }

  public static void printChars(char ch1, char ch2, int numberPerLine) {
    for (int i = ch1, count = 1; i <= ch2; i++) {
      System.out.print((char) i + " ");

      if (count % numberPerLine == 0) {
        System.out.println();
      }
      count++;
    }
  }
}
