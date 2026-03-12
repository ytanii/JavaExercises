import java.util.Scanner;

public class Ex4_12_HexToBinary {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a hex digit: ");
    String s = scanner.nextLine();

    char ch = s.toUpperCase().charAt(0);
    String binary = "";

    switch (ch) {
      case '0':
        binary = "0000";
        break;
      case '1':
        binary = "0001";
        break;
      case '2':
        binary = "0010";
        break;
      case '3':
        binary = "0011";
        break;
      case '4':
        binary = "0100";
        break;
      case '5':
        binary = "0101";
        break;
      case '6':
        binary = "0110";
        break;
      case '7':
        binary = "0111";
        break;
      case '8':
        binary = "1000";
        break;
      case '9':
        binary = "1001";
        break;
      case 'A':
        binary = "1010";
        break;
      case 'B':
        binary = "1011";
        break;
      case 'C':
        binary = "1100";
        break;
      case 'D':
        binary = "1101";
        break;
      case 'E':
        binary = "1110";
        break;
      case 'F':
        binary = "1111";
        break;
      default:
        System.out.println(ch + " is an invalid input");
        System.exit(1);
    }

    System.out.println("The binary value is " + binary);
  }
}
