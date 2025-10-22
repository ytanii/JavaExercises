import java.util.Scanner;

public class Ex2_11_PopulationProjection {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the number of years: ");
    int years = scanner.nextInt();

    int seconds = years * 365 * 24 * 60 * 60;

    double births = seconds / 7.0;
    double deaths = seconds / 13.0;
    double immigration = seconds / 45.0;

    double currentPopulation = 312032486;

    int newPopulation = (int) (currentPopulation + births + immigration - deaths);

    System.out.println("The population in " + years + " years is " + newPopulation);
  }
}
