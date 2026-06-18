import java.util.Scanner;

public class Ex12_06_Hex2Dec {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a hex number: ");
            String hexNumber = scanner.nextLine();
            int decimalNumber = hex2Dec(hexNumber);
            System.out.println("The decimal number is " + decimalNumber);


        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    public static int hex2Dec(String hexString) {
        if(hexString == null || hexString.isEmpty()){
            throw new NumberFormatException("Not a hex number");
        }
        int result = 0;
        for (int i = hexString.length() - 1, j = 0; i >= 0; i--, j++) {
            result += (int) (hexDigitToDecNumber(hexString.charAt(j)) * Math.pow(16, i));
        }
        return result;
    }

    public static int hexDigitToDecNumber(char digit) {


        if (digit >= '0' && digit <= '9') {
            return digit - 48;
        } else if (Character.isLetter(digit)) {
            digit = Character.toUpperCase(digit);
            switch (digit) {
                case 'A' -> {
                    return 10;
                }
                case 'B' -> {
                    return 11;
                }
                case 'C' -> {
                    return 12;
                }
                case 'D' -> {
                    return 13;
                }
                case 'E' -> {
                    return 14;
                }
                case 'F' -> {
                    return 15;
                }
            }
        } else {
            throw new NumberFormatException("Not a hex number");
        }
        throw new NumberFormatException("Not a hex number");
    }
}
