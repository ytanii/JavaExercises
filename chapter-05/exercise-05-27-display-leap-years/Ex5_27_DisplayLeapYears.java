import java.util.Scanner;

public class Ex5_27_DisplayLeapYears {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int counter = 0;
    for (int year = 101, numberPerLine = 0; year <= 2100; year++) {
      if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
        System.out.print(year + " ");
        numberPerLine++;
        if (numberPerLine % 10 == 0) {
          System.out.println();
        }
        counter++;
      }
    }
    System.out.println();
    System.out.println("The number of leap years between 101 and 2100 is " + counter);
  }
}
