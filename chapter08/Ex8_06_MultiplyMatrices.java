import java.util.Scanner;

public class Ex8_06_MultiplyMatrices {
    public static void main(String[] args) {

        System.out.print("Enter matrix1: ");
        double[][] matrix1 = readMatrix();
        System.out.print("Enter matrix2: ");
        double[][] matrix2 = readMatrix();

        displayMatrixAddition(matrix1, matrix2);

    }

    public static double[][] readMatrix() {
        Scanner scanner = new Scanner(System.in);

        double[][] matrix = new double[3][3];

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = scanner.nextDouble();
            }
        }
        return matrix;
    }

    public static double[][] multiplyMatrix(double[][] matrix1, double[][] matrix2) {
        double[][] multiplyMatrix = new double[3][3];

        for (int i = 0; i < multiplyMatrix.length; i++) {
            for (int j = 0; j < multiplyMatrix[i].length; j++) {
                multiplyMatrix[i][j] = (matrix1[i][0] * matrix2[0][j]) + (matrix1[i][1] * matrix2[1][j]) + (matrix1[i][2] * matrix2[2][j]);
            }
        }
        return multiplyMatrix;
    }

    public static void displayMatrixAddition(double[][] matrix1, double[][] matrix2) {
        double[][] multiplyMatrix = multiplyMatrix(matrix1, matrix2);

        for (int i = 0; i < multiplyMatrix.length; i++) {
            for (int j = 0; j < multiplyMatrix[i].length; j++) {
                System.out.printf("%4.1f", matrix1[i][j]);

            }
            if (i == 1) {
                System.out.print(" * ");
            } else {
                System.out.print("   ");
            }
            for (int j = 0; j < multiplyMatrix[i].length; j++) {
                System.out.printf("%4.1f", matrix2[i][j]);

            }
            if (i == 1) {
                System.out.print(" = ");
            } else {
                System.out.print("   ");
            }
            for (int j = 0; j < multiplyMatrix[i].length; j++) {
                System.out.printf("%6.1f", multiplyMatrix[i][j]);

            }
            System.out.println();

        }
    }
}

