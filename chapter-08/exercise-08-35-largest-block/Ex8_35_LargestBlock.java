import java.util.Scanner;

public class Ex8_35_LargestBlock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows in the matrix : ");
        int numberOfRows = scanner.nextInt();

        int[][] matrix = new int[numberOfRows][numberOfRows];
        System.out.println("Enter the matrix row by row: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int[] largestBlockInfo = findLargestBlock(matrix);
        System.out.println("The maximus square submatrix is at (" + largestBlockInfo[0] + ", " + largestBlockInfo[1] + ") with size " + largestBlockInfo[2]);
    }

    public static int[] findLargestBlock(int[][] m) {
        int[][] helper = new int[m.length][m.length];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                helper[i][j] = m[i][j];
            }
        }

        for (int i = 1; i < m.length; i++) {
            for (int j = 1; j < m.length; j++) {
                if (m[i][j] == 1) {
                    helper[i][j] = Math.min(Math.min(helper[i - 1][j], helper[i][j - 1]), helper[i - 1][j - 1]) + 1;
                }
            }
        }

        int max = 0;
        int row = 0, col = 0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (helper[i][j] > max) {
                    max = helper[i][j];
                    row = i;
                    col = j;
                }
            }
        }

        return new int[]{row - max + 1, col - max + 1, max};

    }
}
