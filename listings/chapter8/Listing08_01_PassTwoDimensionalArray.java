import java.util.Scanner;

public class Listing08_01_PassTwoDimensionalArray {
    public static void main(String[] args) {
        int[][] matrix = getArray();


        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }

        System.out.println("The sum of all the elements in the matrix  is " + sum(matrix));

    }

    public static int[][] getArray() {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = new int[3][4];

        System.out.println("Enter " + matrix.length + " rows and " + matrix[0].length + " columns");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = scanner.nextInt();
            }
        }

        return matrix;
    }

    public static int sum(int[][] matrix) {
        int total = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                total += matrix[row][column];
            }
        }
        return total;
    }
}
