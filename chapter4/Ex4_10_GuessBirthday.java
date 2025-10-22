import java.util.Scanner;

public class Ex4_10_GuessBirthday {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String set1 = " 1  3  5  7\n" + " 9 11 13 15\n" + "17 19 21 23\n" + "25 27 29 31";

    String set2 = " 2  3  6  7\n" + "10 11 14 15\n" + "18 19 22 23\n" + "26 27 30 31";

    String set3 = " 4  5  6  7\n" + "12 13 14 15\n" + "20 21 22 23\n" + "28 29 30 31";

    String set4 = " 8  9 10 11\n" + "12 13 14 15\n" + "24 25 26 27\n" + "28 29 30 31";

    String set5 = "16 17 18 19\n" + "20 21 22 23\n" + "24 25 26 27\n" + "28 29 30 31";

    int day = 0;

    System.out.println("Is your birthday in set1, enter Y for yes and N for no: ");
    System.out.println(set1);
    String s = scanner.nextLine();
    char ch = s.charAt(0);
    if (ch == 'Y') {
      day += 1;
    }

    System.out.print("Is your birthday in set2, enter Y for yes and N for no: ");
    System.out.println(set2);
    s = scanner.nextLine();
    ch = s.charAt(0);
    if (ch == 'Y') {

      day += 2;
    }

    System.out.print("Is your birthday in set3, enter Y for yes and N for no: ");
    System.out.println(set3);
    s = scanner.nextLine();
    ch = s.charAt(0);
    if (ch == 'Y') {

      day += 4;
    }

    System.out.print("Is your birthday in set4, enter Y for yes and N for no: ");
    System.out.println(set4);
    s = scanner.nextLine();
    ch = s.charAt(0);
    if (ch == 'Y') {

      day += 8;
    }

    System.out.print("Is your birthday in set5, enter Y for yes and N for no: ");
    System.out.println(set5);
    s = scanner.nextLine();
    ch = s.charAt(0);
    if (ch == 'Y') {
      day += 16;
    }

    System.out.println("Your birthday is " + day);
  }
}
