import java.util.Scanner;

public class Ex4_23_Payroll {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter employee's name: ");
    String employeeName = scanner.nextLine();

    System.out.print("Enter number of hours worked in a week: ");
    double numberOfHoursWorked = Double.parseDouble(scanner.nextLine());

    System.out.print("Enter hourly pay rate: ");
    double hourlyPayRate = Double.parseDouble(scanner.nextLine());

    System.out.print("Enter federal tax withholding rate: ");
    double federalTaxWithHoldRate = Double.parseDouble(scanner.nextLine());

    System.out.print("Enter state tax withholding rate: ");
    double stateTaxWithHoldRate = Double.parseDouble(scanner.nextLine());

    double grossPay = hourlyPayRate * numberOfHoursWorked;

    System.out.println("Employee name: " + employeeName);
    System.out.println("Hours worked: " + numberOfHoursWorked);
    System.out.println("Enter hourly pay rate: " + hourlyPayRate);
    System.out.println("Gross pay: " + grossPay);
    System.out.println("Deductions: ");
    System.out.printf(
        "%20s (%.1f%%): $%.2f \n",
        "Federal Withholding",
        (federalTaxWithHoldRate * 100.0),
        (federalTaxWithHoldRate * grossPay));
    System.out.printf(
        "%18s (%.1f%%): $%.2f \n",
        "State Withholding", (stateTaxWithHoldRate * 100.0), (stateTaxWithHoldRate * grossPay));
    System.out.printf(
        "%17s $%.2f \n",
        "Total Deduction:", (stateTaxWithHoldRate * grossPay + federalTaxWithHoldRate * grossPay));

    System.out.printf(
        "%s %.2f",
        "Net Pay:",
        (grossPay - (stateTaxWithHoldRate * grossPay + federalTaxWithHoldRate * grossPay)));
  }
}
