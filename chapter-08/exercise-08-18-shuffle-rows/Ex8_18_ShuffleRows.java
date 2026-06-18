import java.util.Scanner;

public class Ex8_18_ShuffleRows {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = {{1, 2, 32}, {3, 4, 42}, {5, 6, 1}, {7, 8, 52}, {9, 10, 999}};

        shuffle(matrix);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void shuffle(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int row = (int) (Math.random() * matrix.length);

            int[] helper = new int[matrix[i].length];
            for (int j = 0; j < matrix[i].length; j++) {
                helper[j] = matrix[i][j];

            }
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = matrix[row][j];

            }

            for (int j = 0; j < matrix[i].length; j++) {
                matrix[row][j] = helper[j];

            }
        }

    }
}
