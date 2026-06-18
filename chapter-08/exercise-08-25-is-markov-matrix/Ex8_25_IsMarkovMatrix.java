import java.util.Scanner;

public class Ex8_25_IsMarkovMatrix {
    public static void main(String[] args) {

        System.out.println("Enter a 3-by-3 matrix row by row:");
        double[][] matrix = getMatrix();


        if (checkMarkovMatrix(matrix)) {
            System.out.println("It is a Markov matrix");
        } else {
            System.out.println("It is not a Markov matrix");
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

    public static boolean checkMarkovMatrix(double[][] matrix) {
        if (allPositive(matrix) && allColumnSumsOne(matrix)) {
            return true;

        } else {
            return false;
        }

    }

    public static double sumColumn(double[][] matrix, int i) {
        double sum = 0;
        for (int j = 0; j < matrix.length; j++) {
            sum += matrix[j][i];
        }
        return sum;
    }

    public static boolean allPositive(double[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < 0) {
                    return false;

                }
            }
        }
        return true;
    }

    public static boolean allColumnSumsOne(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            if (sumColumn(matrix, i) != 1) {
                return false;
            }
        }
        return true;
    }
}
