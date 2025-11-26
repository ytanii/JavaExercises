import java.util.Scanner;
import java.util.ArrayList;

public class Ex11_09_LargestRowsAndColumns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the array size n: ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];
        ArrayList<Integer> maxRowIndexes = new ArrayList<>();
        ArrayList<Integer> maxColumnIndexes = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
            }
        }

        System.out.println("The random array is");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }


        int[] countsRow = new int[n];
        int[] countsColumn = new int[n];
        int count;
        for (int i = 0; i < n; i++) {
            count = 0;
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
            countsRow[i] = count;
        }

        for (int i = 0; i < n; i++) {
            count = 0;
            for (int j = 0; j < n; j++) {
                if (matrix[j][i] == 1) {
                    count++;
                }
            }
            countsColumn[i] = count;
        }


        int maxRow = countsRow[0];
        for (int i = 1; i < n; i++) {
            if (maxRow < countsRow[i]) {
                maxRow = countsRow[i];
            }
        }


        int maxColumn = countsColumn[0];
        for (int i = 1; i < n; i++) {
            if (maxColumn < countsColumn[i]) {
                maxColumn = countsColumn[i];
            }
        }


        for (int i = 0; i < n; i++) {
            if (countsRow[i] == maxRow) {
                maxRowIndexes.add(i);
            }

        }

        for (int i = 0; i < n; i++) {
            if (countsColumn[i] == maxColumn) {
                maxColumnIndexes.add(i);
            }

        }


        System.out.print("The largest row index: ");
        for (int i = 0; i < maxRowIndexes.size(); i++) {
            System.out.print(maxRowIndexes.get(i) + (i != maxRowIndexes.size() - 1 ? ", " : " "));

        }
        System.out.println();
        System.out.print("The largest column index: ");
        for (int i = 0; i < maxColumnIndexes.size(); i++) {
            System.out.print(maxColumnIndexes.get(i) + (i != maxColumnIndexes.size() - 1 ? ", " : " "));
        }
        System.out.println();
    }
}
