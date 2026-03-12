import java.util.Scanner;

public class Ex8_26_SortRows {
    public static void main(String[] args) {
        System.out.println("Enter a 3-by-3 matrix row by row: ");
        double[][] matrix = getMatrix();
        displayMatrix(matrix);
        sortRows(matrix);
        System.out.println();
        displayMatrix(matrix);

    }

    public static void displayMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static double[][] getMatrix() {
        Scanner scanner = new Scanner(System.in);
        double[][] matrix = new double[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }
        return matrix;
    }

    public static void sortRows(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                int indexOfMin = j;
                for (int n = j + 1; n < matrix[i].length; n++) {
                    if (matrix[i][n] < matrix[i][indexOfMin]) {
                        indexOfMin = n;
                    }
                }
                double helper = matrix[i][indexOfMin];
                matrix[i][indexOfMin] = matrix[i][j];
                matrix[i][j] = helper;
            }

        }
    }
}
