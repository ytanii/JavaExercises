import java.util.Scanner;

public class Ex4_24_OrderThreeCities {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the first city: ");
    String city1 = scanner.nextLine();

    System.out.print("Enter the second city: ");
    String city2 = scanner.nextLine();

    System.out.print("Enter the third city: ");
    String city3 = scanner.nextLine();

    if (city1.compareToIgnoreCase(city2) < 0 && city1.compareToIgnoreCase(city3) < 0) {
      if (city2.compareToIgnoreCase(city3) < 0) {
        System.out.println(
            "The three cities in alphabetical order are " + city1 + ", " + city2 + ", " + city3);

      } else {
        System.out.println(
            "The three cities in alphabetical order are " + city1 + ", " + city3 + ", " + city2);
      }

    } else if (city2.compareToIgnoreCase(city1) < 0 && city2.compareToIgnoreCase(city3) < 0) {
      if (city1.compareToIgnoreCase(city3) < 0) {
        System.out.println(
            "The three cities in alphabetical order are " + city2 + ", " + city1 + ", " + city3);

      } else {
        System.out.println(
            "The three cities in alphabetical order are " + city2 + ", " + city3 + ", " + city1);
      }

    } else {
      if (city1.compareToIgnoreCase(city2) < 0) {
        System.out.println(
            "The three cities in alphabetical order are " + city3 + ", " + city1 + ", " + city2);

      } else {
        System.out.println(
            "The three cities in alphabetical order are " + city3 + ", " + city2 + ", " + city1);
      }
    }
  }
}
