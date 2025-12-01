import java.util.Scanner;

public class Ex12_07_Bin2Dec {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a binary number: ");
            String binNumber = scanner.nextLine();
            int decimalNumber = bin2Dec(binNumber);
            System.out.println("The decimal number is " + decimalNumber);


        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    public static int bin2Dec(String binString) {
        if (binString == null || binString.isEmpty()) {
            throw new NumberFormatException("Not a binary number");
        }
        int result = 0;
        for (int i = binString.length() - 1, j = 0; i >= 0; i--, j++) {
            result += (int) (binDigitToDecNumber(binString.charAt(j)) * Math.pow(2, i));
        }
        return result;
    }

    public static int binDigitToDecNumber(char digit) {

        if (digit >= '0' && digit <= '1') {
            return digit - 48;
        } else {
            throw new NumberFormatException("Not a binary number");
        }
    }

}
