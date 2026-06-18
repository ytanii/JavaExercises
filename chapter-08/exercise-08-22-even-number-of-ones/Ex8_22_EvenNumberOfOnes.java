import java.util.Scanner;

public class Ex8_22_EvenNumberOfOnes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[6][6];

        fillMatrix(matrix);

        displayMatrix(matrix);

        System.out.println("Rows that have an even number of ones: ");

        int count = 0;
        for(int i = 0; i < matrix.length; i++){
            if(evenRow(matrix,i) >= 0){
                count++;
            }
            System.out.print(evenRow(matrix,i) >= 0 ? evenRow(matrix,i) + " " : "");

        }
        System.out.println();

        System.out.println("Columns that have an even number of ones: ");

        for(int i = 0; i < matrix.length; i++){
            if(evenColumn(matrix,i) >= 0){
                count++;
            }
            System.out.print(evenColumn(matrix,i) >= 0 ? evenColumn(matrix,i) + " " : "");

        }

        System.out.println();
        System.out.println();
        if(count == 12){
            System.out.println("Every row and column has an even number of 1s");
        }else{
            System.out.println("Not all rows and columns have an even number of 1s");
        }
    }

    public static void fillMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
            }
        }
    }

    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int countOnesRow(int[][] matrix, int i) {
        int count = 0;
        for (int j = 0; j < matrix[i].length; j++) {
            if (matrix[i][j] == 1) {
                count++;
            }
        }
        return count;
    }
    public static int countOnesColumn ( int[][] matrix, int i){
        int count = 0;
        for (int j = 0; j < matrix[i].length; j++) {
            if (matrix[j][i] == 1) {
                count++;
            }
        }
        return count;

    }

    public static int evenRow(int[][] matrix, int i){
        if(countOnesRow(matrix,i) % 2 == 0){
            return i;
        }else{
            return -1;
        }
    }
    public static int evenColumn(int[][] matrix, int i){
        if(countOnesColumn(matrix,i) % 2 == 0){
            return i;
        }else{
            return -1;
        }
    }

}
