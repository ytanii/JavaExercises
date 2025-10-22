
public class Ch6_Listing_6_9_MethodOverloading {
  public static void main(String[] args) {
    System.out.println("The maximum of 3 and 4 is " + max(3, 4));
    System.out.println("The maximum of 3.0 and 5.4 is " + max(3.0, 5.4));
    System.out.println("The maximum of 3.0, 5.4, and 10.14 is " + max(3.0, 5.4, 10.14));
  }

  public static int max(int number1, int number2) {
    return number1 > number2 ? number1 : number2;
  }

  public static double max(double number1, double number2) {
    return number1 > number2 ? number1 : number2;
  }

  public static double max(double number1, double number2, double number3) {
    return max(max(number1, number2), number3);
  }
}
