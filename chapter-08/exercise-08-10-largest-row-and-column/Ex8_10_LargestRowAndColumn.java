import java.util.Scanner;

public class Ex8_10_LargestRowAndColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = createMatrix();

        displayMatrix(matrix);

        System.out.println("The largest row index: " + getLargestRowIndex(matrix));
        System.out.println("The largest column index: " + getLargestColumnIndex(matrix));

    }

    public static int[][] createMatrix() {
        int[][] matrix = new int[4][4];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
            }
        }

        return matrix;
    }

    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

    }

    public static int getLargestRowIndex(int[][] matrix) {

        int largestRowIndex = 0;
        int maxCount = 0;

        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                largestRowIndex = i;
            }
        }


        return largestRowIndex;

    }

    public static int getLargestColumnIndex(int[][] matrix) {
        int largestColumnIndex = 0;
        int maxCount = 0;
        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[j][i] == 1) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                largestColumnIndex = i;
            }
        }

        return largestColumnIndex;
    }


}
