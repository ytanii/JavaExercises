import java.util.Scanner;

public class Ex2_07_NumberOfYears {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number of minutes: ");
    int minutes = scanner.nextInt();

    int years = minutes / 525600;
    int days = minutes / 1440;

    int remainingDays = (days % 365);

    System.out.println(
        minutes + " minutes is approximately " + years + " years and " + remainingDays + " days");
  }
}
