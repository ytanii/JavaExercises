import java.util.Scanner;

public class Ex8_05_AddMatrices {
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

    public static double[][] addMatrix(double[][] matrix1, double[][] matrix2) {
        double[][] sumMatrix = new double[3][3];

        for (int i = 0; i < sumMatrix.length; i++) {
            for (int j = 0; j < sumMatrix[i].length; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return sumMatrix;
    }

    public static void displayMatrixAddition(double[][] matrix1, double[][] matrix2) {
        double[][] sumMatrix = addMatrix(matrix1, matrix2);

        for (int i = 0; i < sumMatrix.length; i++) {
            for (int j = 0; j < sumMatrix[i].length; j++) {
                System.out.printf("%4.1f", matrix1[i][j]);

            }
            if (i == 1) {
                System.out.print(" + ");
            } else {
                System.out.print("   ");
            }
            for (int j = 0; j < sumMatrix[i].length; j++) {
                System.out.printf("%4.1f", matrix2[i][j]);

            }
            if (i == 1) {
                System.out.print(" = ");
            } else {
                System.out.print("   ");
            }
            for (int j = 0; j < sumMatrix[i].length; j++) {
                System.out.printf("%4.1f", sumMatrix[i][j]);

            }
            System.out.println();

        }
    }

}


