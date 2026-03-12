import java.util.Scanner;

public class Ex8_23_FindFlippedCell {
    public static void main(String[] args) {
        int[][] matrix = new int[6][6];
        System.out.println("Enter a matrix 6-by-6 matrix row by row: ");
        matrix = getMatrix();

        int r = 0;
        int c = 0;

        for (int i = 0; i < matrix.length; i++) {
            if (!evenRow(matrix, i)) {
                r = i;
                break;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            if (!evenColumn(matrix, i)) {
                c = i;
                break;
            }
        }

        System.out.println("The flipped cell is at (" + r + ", " + c + ")");

    }

    public static int[][] getMatrix() {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[6][6];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    public static int countOnesRow(int[][] matrix, int i) {
        int count = 0;
        for (int j = 0; j < matrix[i].length; j++) {
            if (matrix[i][j] == 1) {
                count++;
            }
        }
        return count;
    }

    public static int countOnesColumn(int[][] matrix, int i) {
        int count = 0;
        for (int j = 0; j < matrix[i].length; j++) {
            if (matrix[j][i] == 1) {
                count++;
            }
        }
        return count;
    }

    public static boolean evenRow(int[][] matrix, int i) {
        if (countOnesRow(matrix, i) % 2 == 0) {
            return true;
        }
        return false;

    }

    public static boolean evenColumn(int[][] matrix, int i) {
        if (countOnesColumn(matrix, i) % 2 == 0) {
            return true;
        }
        return false;

    }
}
