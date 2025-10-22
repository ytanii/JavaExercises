import java.util.Scanner;

public class Ch6_Listing_6_6_GreatestCommonDivisor {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter first integer: ");
    int n1 = scanner.nextInt();
    System.out.print("Enter second integer: ");
    int n2 = scanner.nextInt();

    System.out.println(
        "The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd(n1, n2));
  }

  public static int gcd(int n1, int n2) {
    int gcd = 1;

    for (int i = 2; i <= (n1 < n2 ? n1 : n2); i++) {
      if (n1 % i == 0 && n2 % i == 0) {
        gcd = i;
      }
    }
    return gcd;
  }
}
