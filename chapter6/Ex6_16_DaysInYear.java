public class Ex6_16_DaysInYear {
  public static void main(String[] args) {
    System.out.printf("%5s%18s\n", "Year", "Number of Days");

    for (int i = 2000; i <= 2020; i++) {
      System.out.printf(" %4d%12d\n", i, numberOfDaysInAYear(i));
    }
  }

  public static int numberOfDaysInAYear(int year) {
    return isLeapYear(year) ? 366 : 365;
  }

  public static boolean isLeapYear(int year) {
    return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
  }
}
