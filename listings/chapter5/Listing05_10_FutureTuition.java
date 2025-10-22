import java.util.Scanner;

public class Listing05_10_FutureTuition {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter tuition: ");
    int initialTuition = scanner.nextInt();

    System.out.print("Enter increase rate every year: ");
    double growthRate = scanner.nextDouble();

    int years = (int) (Math.ceil(Math.log(2) / Math.log(1 + growthRate)));

    System.out.println("It takes " + years + " years for your tuition to double.");
  }
}
