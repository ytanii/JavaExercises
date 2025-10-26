import java.util.Scanner;

public class Ex8_01_SumElementsColumn {
    public static void main(String[] args) {

        double[][] matrix = readMatrix();

        for (int j = 0; j < matrix[0].length; j++) {
            System.out.println("Sum of the elements at column " + j + " is " + sumColumn(matrix, j));

        }
    }

    public static double sumColumn(double[][] matrix, int columnIndex) {
        double sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][columnIndex];
        }

        return sum;

    }

    public static double[][] readMatrix() {
        Scanner scanner = new Scanner(System.in);

        double[][] matrix = new double[3][4];
        System.out.println("Enter a " + matrix.length + "-by-" + matrix[0].length + " matrix row by row: ");

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = scanner.nextDouble();
            }
        }
        return matrix;
    }
}
