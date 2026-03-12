import java.util.Scanner;

public class Ex8_24_CheckSudokuSolution {
    public static void main(String[] args) {

        System.out.println("Enter sudoku solution: ");
        int[][] sudokuBoard = getSudokuBoard();

        if (checkSudokuSolution(sudokuBoard)) {
            System.out.println("Valid Solution");
        } else {
            System.out.println("Invalid Solution");
        }
    }

    public static int[][] getSudokuBoard() {
        Scanner scanner = new Scanner(System.in);
        int[][] sudokuBoard = new int[9][9];
        for (int i = 0; i < sudokuBoard.length; i++) {
            for (int j = 0; j < sudokuBoard[i].length; j++) {
                sudokuBoard[i][j] = scanner.nextInt();
            }
        }
        return sudokuBoard;
    }

    public static boolean checkSudokuSolution(int[][] sudokuBoard) {
        for (int i = 0; i < sudokuBoard.length; i++) {
            if (!checkRow(sudokuBoard, i)) {
                return false;
            }
            if (!checkColumn(sudokuBoard, i)) {
                return false;
            }

        }
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                if (!checkBox(sudokuBoard, i, j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkRow(int[][] sudokuBoard, int i) {
        int[] check = new int[9];
        for (int j = 0; j < sudokuBoard[i].length; j++) {
            check[sudokuBoard[i][j] - 1]++;
        }

        for (int n = 0; n < check.length; n++) {
            if (check[n] != 1) {
                return false;
            }
        }
        return true;

    }

    public static boolean checkColumn(int[][] sudokuBoard, int i) {
        int[] check = new int[9];
        for (int j = 0; j < sudokuBoard[i].length; j++) {
            check[sudokuBoard[j][i] - 1]++;
        }

        for (int n = 0; n < check.length; n++) {
            if (check[n] != 1) {
                return false;
            }
        }
        return true;

    }

    public static boolean checkBox(int[][] sudokuBoard, int rowStart, int colStart) {
        int[] check = new int[9];
        for (int i = rowStart; i < rowStart + 3; i++) {
            for (int j = colStart; j < colStart + 3; j++) {
                check[sudokuBoard[i][j] - 1]++;
            }
        }
        for (int n = 0; n < 9; n++) {
            if (check[n] != 1){
                return false;
            }
        }
        return true;
    }
}
