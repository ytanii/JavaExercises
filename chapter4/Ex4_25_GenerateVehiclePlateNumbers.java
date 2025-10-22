import java.util.Scanner;

public class Ex4_25_GenerateVehiclePlateNumbers {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char plateDigit1 = (char) ((int) (Math.random() * 26) + 'A');
    char plateDigit2 = (char) ((int) (Math.random() * 26) + 'A');
    char plateDigit3 = (char) ((int) (Math.random() * 26) + 'A');
    int plateDigit4 = (int) (Math.random() * 10);
    int plateDigit5 = (int) (Math.random() * 10);
    int plateDigit6 = (int) (Math.random() * 10);
    int plateDigit7 = (int) (Math.random() * 10);

    System.out.println(
        "Generated plate number is "
            + plateDigit1
            + plateDigit2
            + plateDigit3
            + plateDigit4
            + plateDigit5
            + plateDigit6
            + plateDigit7);
  }
}
