import java.util.Scanner;

public class Ex8_28_StrictlyIdenticalArrays {
    public static void main(String[] args) {
        System.out.print("Enter list1: ");
        int[][] matrix1 = getMatrix();
        System.out.print("Enter list2: ");
        int[][] matrix2 = getMatrix();

        if (equals(matrix1, matrix2)) {
            System.out.println("The two arrays are strictly identical");
        } else {
            System.out.println("The two arrays are not strictly identical");
        }

    }

    public static int[][] getMatrix() {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[3][3];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        return matrix;
    }

    public static boolean equals(int[][] matrix1, int[][] matrix2) {
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                if (matrix1[i][j] != matrix2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
