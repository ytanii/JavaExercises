
import java.util.Scanner;

public class Listing08_04_CheckSudokuSolution {
    public static void main(String[] args) {

        int[][] grid = readSolution();


        if (isValid(grid)) {
            System.out.println("Valid solution");
        } else {
            System.out.println("Invalid solution");
        }


    }


    public static int[][] readSolution() {
        Scanner scanner = new Scanner(System.in);
        int[][] grid = new int[9][9];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }
        return grid;

    }

    public static boolean isValid(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                int value = grid[i][j];
                if (value < 1 || value > 9) {
                    return false;
                }
                for (int n = 0; n < grid[i].length; n++) {
                    if (n != j && grid[i][j] == grid[i][n]) {
                        return false;
                    }
                    if (n != i && grid[i][j] == grid[n][j]) {
                        return false;
                    }

                }

            }



        }
        for (int r = 0; r < grid.length; r += 3) {
            for (int c = 0; c < grid.length; c += 3) {
                if (!isValidBlock(grid, r, c)) {
                    return false;
                }
            }
        }

        return true;


    }

    public static boolean isValidBlock(int[][] grid, int rowStart, int colStart) {
        boolean[] seen = new boolean[9];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int value = grid[rowStart + i][colStart + j];
                if (value < 1 || value > 9) {
                    return false;
                }
                if (seen[value - 1]) {
                    return false;
                }
                seen[value - 1] = true;
            }
        }
        return true;
    }
}
