import java.util.Scanner;

public class Ex8_20_ConnectFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] connectFourBoard = new char[6][7];
        int[] stacks = new int[connectFourBoard[0].length];
        String winner = "";


        int i = 0;
        while (!winCheck(connectFourBoard)) {
            displayBoard(connectFourBoard);
            if (i % 2 == 0) {
                System.out.print("Drop a red disk at column (0-6): ");
                int column = scanner.nextInt();
                if (stacks[column] > connectFourBoard.length - 1) {
                    System.out.println("Full column");
                } else {
                    i++;
                    updateBoard(column, 0, connectFourBoard, stacks);

                }
                winner = "red";

            } else {

                System.out.print("Drop a yellow disk at column (0-6): ");
                int column = scanner.nextInt();
                if (stacks[column] > connectFourBoard.length - 1) {
                    System.out.println("Full column");
                } else {
                    i++;
                    updateBoard(column, 1, connectFourBoard, stacks);
                }
                winner = "yellow";
            }
        }

        displayBoard(connectFourBoard);
        System.out.println("The " + winner + " player won");

        System.out.println();


    }

    public static void displayBoard(char[][] connectFourBoard) {
        for (int i = 0; i < connectFourBoard.length; i++) {
            for (int j = 0; j < connectFourBoard[i].length; j++) {
                System.out.print(" | " + ((connectFourBoard[i][j] == '\u0000') ? " " : connectFourBoard[i][j]));
            }
            System.out.print(" |");
            System.out.println();
        }
        System.out.println("-------------------------------");
    }

    public static void updateBoard(int column, int playerID, char[][] connectFourBoard, int[] stacks) {
        stacks[column]++;

        if (playerID == 0) {
            connectFourBoard[(connectFourBoard.length - 1) - (stacks[column] - 1)][column] = 'R';
        } else {
            connectFourBoard[(connectFourBoard.length - 1) - (stacks[column] - 1)][column] = 'Y';
        }


    }

    public static boolean winCheck(char[][] connectFourBoard) {
        if (connectFourBoard.length == 0 || connectFourBoard[0].length == 0) {
            return false;
        }
        for (int i = 0; i < connectFourBoard.length; i++) {
            int count = 1;
            for (int j = 1; j < connectFourBoard[i].length; j++) {
                if (connectFourBoard[i][j] == connectFourBoard[i][j - 1] && connectFourBoard[i][j] != '\u0000') {
                    count++;
                    if (count == 4) {
                        return true;
                    }
                } else {
                    count = 1;
                }

            }

        }

        for (int i = 0; i < connectFourBoard[0].length; i++) {
            int count = 1;
            for (int j = 1; j < connectFourBoard.length; j++) {
                if (connectFourBoard[j][i] == connectFourBoard[j - 1][i] && connectFourBoard[j][i] != '\u0000') {
                    count++;
                    if (count == 4) {
                        return true;
                    }
                } else {
                    count = 1;
                }
            }

        }


        for (int i = 0; i < connectFourBoard.length - 3; i++) {
            for (int j = 0; j < connectFourBoard[i].length - 3; j++) {
                int count = 1;
                for (int n = 1; n < 4; n++) {
                    if (connectFourBoard[i + n][j + n] == connectFourBoard[i][j] && connectFourBoard[i][j] != '\u0000') {
                        count++;
                        if (count == 4) {
                            return true;
                        }
                    } else {
                        break;
                    }
                }
            }
        }

        for (int i = 0; i < connectFourBoard.length - 3; i++) {
            for (int j = 3; j < connectFourBoard[i].length; j++) {
                int count = 1;
                for (int n = 1; n < 4; n++) {
                    if (connectFourBoard[i + n][j - n] == connectFourBoard[i][j] && connectFourBoard[i][j] != '\u0000') {
                        count++;
                        if (count == 4) return true;
                    } else break;
                }
            }
        }

        return false;
    }

}
