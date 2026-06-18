import java.util.Scanner;

public class Ex8_02_SumMajorDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] matrix = readMatrix();

        System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(matrix));

    }

    public static double[][] readMatrix() {
        Scanner scanner = new Scanner(System.in);

        double[][] matrix = new double[4][4];

        System.out.println("Enter a 4-by-4 matrix row by row");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        return matrix;

    }

    public static double sumMajorDiagonal(double[][] matrix) {
        double sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];

        }
        return sum;
    }
}
