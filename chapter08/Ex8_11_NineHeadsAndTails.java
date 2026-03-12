import java.util.Scanner;

public class Ex8_11_NineHeadsAndTails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number between 0 and 511");
        int number = scanner.nextInt();

        char[][] coins = create3by3CoinMatrix(number);

        displayCoins(coins);

    }

    public static void displayCoins(char[][] coins) {
        for (int i = 0; i < coins.length; i++) {
            for (int j = 0; j < coins[i].length; j++) {
                System.out.print(coins[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] decToBinary(int decimalNumber) {
        int[] binary = new int[9];

        for (int i = 8; i >= 0; i--) {
            binary[i] = decimalNumber % 2;
            decimalNumber /= 2;
        }

        return binary;
    }

    public static char[][] create3by3CoinMatrix(int decimalNumber) {
        int[] binary = decToBinary(decimalNumber);
        char[][] coins = new char[3][3];
        int n = 0;
        for (int i = 0; i < coins.length; i++) {
            for (int j = 0; j < coins[i].length; j++, n++) {
                if (binary[n] == 0) {
                    coins[i][j] = 'H';
                } else {
                    coins[i][j] = 'T';
                }
            }
        }

        return coins;
    }


}
