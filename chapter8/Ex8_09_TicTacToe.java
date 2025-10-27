import java.util.Scanner;

public class Ex8_09_TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] ticTacToeBoard = new char[3][3];

        int i = 0;
        int lastPlayer = ' ';

        while (!isWinner(ticTacToeBoard) && !isDraw(ticTacToeBoard)) {


            System.out.println("--------------");

            for (int j = 0; j < ticTacToeBoard.length; j++) {
                System.out.print("|");
                for (int n = 0; n < ticTacToeBoard[j].length; n++) {
                    System.out.printf("%2c%2s", ticTacToeBoard[j][n], "|");
                }
                System.out.println();
                System.out.println("--------------");
            }

            if (i % 2 == 0) {
                System.out.println("Enter a row (0, 1, or 2) for player X");
                int row = scanner.nextInt();
                System.out.println("Enter a row (0, 1, or 2) for play X");
                int column = scanner.nextInt();
                updateTicTacToeBoard(ticTacToeBoard, row, column, 0);
                lastPlayer = 'X';


            } else {
                System.out.println("Enter a row (0, 1, or 2) for player O");
                int row = scanner.nextInt();
                System.out.println("Enter a row (0, 1, or 2) for play O");
                int column = scanner.nextInt();
                updateTicTacToeBoard(ticTacToeBoard, row, column, 1);
                lastPlayer = 'O';

            }

            i++;
        }


        System.out.println("--------------");

        for (int j = 0; j < ticTacToeBoard.length; j++) {
            System.out.print("|");
            for (int n = 0; n < ticTacToeBoard[j].length; n++) {
                System.out.printf("%2c%2s", ticTacToeBoard[j][n], "|");
            }
            System.out.println();
            System.out.println("--------------");
        }


        if (isWinner(ticTacToeBoard)) {
            System.out.println((char) lastPlayer + " player won");
        } else {
            System.out.println("Its a draw");
        }

    }

    public static void updateTicTacToeBoard(char[][] ticTacToeBoard, int row, int column, int player) {
        char chr;
        if (player == 0) {
            chr = 'X';
        } else {
            chr = 'O';
        }
        ticTacToeBoard[row][column] = chr;

    }

    public static boolean isWinner(char[][] ticTacToeBoard) {
        int count = 0;
        for (int i = 0; i < ticTacToeBoard.length; i++) {
            if (ticTacToeBoard[i][0] != '\0' &&
                    ticTacToeBoard[i][0] == ticTacToeBoard[i][1] &&
                    ticTacToeBoard[i][1] == ticTacToeBoard[i][2]) {
                return true;
            }
            if (ticTacToeBoard[0][i] != '\0' &&
                    ticTacToeBoard[0][i] == ticTacToeBoard[1][i] &&
                    ticTacToeBoard[1][i] == ticTacToeBoard[2][i]) {
                return true;
            }
        }

        if (ticTacToeBoard[0][0] != '\0' &&
                ticTacToeBoard[0][0] == ticTacToeBoard[1][1] &&
                ticTacToeBoard[1][1] == ticTacToeBoard[2][2]) {
            return true;
        }

        if (ticTacToeBoard[0][2] != '\0' &&
                ticTacToeBoard[0][2] == ticTacToeBoard[1][1] &&
                ticTacToeBoard[1][1] == ticTacToeBoard[2][0]) {
            return true;
        }

        return false;


    }

    public static boolean isDraw(char[][] ticTacToeBoard) {
        int fullCounter = 0;
        for (int i = 0; i < ticTacToeBoard.length; i++) {
            for (int j = 0; j < ticTacToeBoard[i].length; j++) {
                if (ticTacToeBoard[i][j] != '\0') {
                    fullCounter++;
                }

            }
        }
        if (!isWinner(ticTacToeBoard) && fullCounter == 9) {
            return true;

        }

        return false;

    }
}
