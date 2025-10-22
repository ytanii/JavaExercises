import java.util.Scanner;

public class Ch2_3_9ComputingTaxes {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println(
        "Enter a status: 0 for Single File, 1 for Married Joint, 2 for Married Separate, 3 for Head"
            + " of Household");
    int status = scanner.nextInt();

    System.out.println("Enter your taxable income: ");
    int taxableIncome = scanner.nextInt();
    double tax = 0;

    if (status == 0) {
      if (taxableIncome > 372950) {
        tax += (taxableIncome - 372950) * 0.35;
        taxableIncome = 372950;
      }
      if (taxableIncome > 171550) {
        tax += (taxableIncome - 171550) * 0.33;
        taxableIncome = 171550;
      }
      if (taxableIncome > 82250) {
        tax += (taxableIncome - 82250) * 0.28;
        taxableIncome = 82250;
      }
      if (taxableIncome > 33950) {
        tax += (taxableIncome - 33950) * 0.25;
        taxableIncome = 33950;
      }
      if (taxableIncome > 8350) {
        tax += (taxableIncome - 8350) * 0.15;
        taxableIncome = 8350;
      }
      if (taxableIncome > 0) {
        tax += (taxableIncome) * 0.1;
      }

    } else if (status == 1) {
      if (taxableIncome > 372950) {
        tax += (taxableIncome - 372950) * 0.35;
        taxableIncome = 372950;
      }
      if (taxableIncome > 208850) {
        tax += (taxableIncome - 208850) * 0.33;
        taxableIncome = 208850;
      }
      if (taxableIncome > 137050) {
        tax += (taxableIncome - 137050) * 0.28;
        taxableIncome = 137050;
      }
      if (taxableIncome > 67900) {
        tax += (taxableIncome - 67900) * 0.25;
        taxableIncome = 67900;
      }
      if (taxableIncome > 16700) {
        tax += (taxableIncome - 16700) * 0.15;
        taxableIncome = 16700;
      }
      if (taxableIncome > 0) {
        tax += (taxableIncome) * 0.1;
      }

    } else if (status == 2) {
      if (taxableIncome > 186475) {
        tax += (taxableIncome - 186475) * 0.35;
        taxableIncome = 186475;
      }
      if (taxableIncome > 104425) {
        tax += (taxableIncome - 104425) * 0.33;
        taxableIncome = 104425;
      }
      if (taxableIncome > 68526) {
        tax += (taxableIncome - 68526) * 0.28;
        taxableIncome = 68526;
      }
      if (taxableIncome > 33950) {
        tax += (taxableIncome - 33950) * 0.25;
        taxableIncome = 33950;
      }
      if (taxableIncome > 8350) {
        tax += (taxableIncome - 8350) * 0.15;
        taxableIncome = 8350;
      }
      if (taxableIncome > 0) {
        tax += (taxableIncome) * 0.1;
      }
    } else if (status == 3) {
      if (taxableIncome > 372950) {
        tax += (taxableIncome - 372950) * 0.35;
        taxableIncome = 372950;
      }
      if (taxableIncome > 190200) {
        tax += (taxableIncome - 190200) * 0.33;
        taxableIncome = 190200;
      }
      if (taxableIncome > 117450) {
        tax += (taxableIncome - 117450) * 0.28;
        taxableIncome = 117450;
      }
      if (taxableIncome > 45500) {
        tax += (taxableIncome - 45500) * 0.25;
        taxableIncome = 45500;
      }
      if (taxableIncome > 11950) {
        tax += (taxableIncome - 11950) * 0.15;
        taxableIncome = 11950;
      }
      if (taxableIncome > 0) {
        tax += (taxableIncome) * 0.1;
      }

    } else {
      System.out.println("Wrong status");
    }

    System.out.println("Your tax amount is " + tax);
  }
}
