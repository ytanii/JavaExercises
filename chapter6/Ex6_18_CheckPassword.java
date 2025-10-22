import java.util.Scanner;

public class Ex6_18_CheckPassword {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Create your password: ");
    String password = scanner.nextLine();

    System.out.println(validatePassword(password) ? "Valid Password" : "Invalid Password");
  }

  public static boolean validatePassword(String password) {
    int digits = 0;
    if (password.length() < 8) {
      return false;
    }
    for (int i = 0; i < password.length(); i++) {
      if (!(Character.isDigit(password.charAt(i)) || Character.isAlphabetic(password.charAt(i)))) {
        return false;
      }
      if (Character.isDigit(password.charAt(i))) {
        digits++;
      }
    }

    if (digits < 2) {
      return false;
    }

    return true;
  }
}
