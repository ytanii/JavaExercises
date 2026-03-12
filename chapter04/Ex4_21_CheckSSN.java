import java.util.Scanner;

public class Ex4_21_CheckSSN {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a SSN: ");
    String ssn = scanner.nextLine();

    String s1 = ssn.substring(0, ssn.indexOf('-'));

    String helper = ssn.substring(ssn.indexOf('-') + 1);

    String s2 = helper.substring(0, helper.indexOf('-'));

    String s3 = helper.substring(helper.indexOf('-') + 1);

    boolean isValidSSN = (s1.length() == 3) && (s2.length() == 2) && (s3.length() == 4);

    if (isValidSSN) {
      System.out.println(ssn + " is a valid social security number");
    } else {
      System.out.println(ssn + " is an invalid social security number");
    }
  }
}
