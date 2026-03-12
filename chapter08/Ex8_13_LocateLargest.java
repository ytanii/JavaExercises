import java.util.Scanner;

public class Ex8_13_LocateLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns of the array: ");
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        System.out.println("Enter the array: ");
        double[][] matrix = createMatrix(rows,columns);

        int[] locationOfMax = locateLargest(matrix);

        System.out.println("The location of the largest element is at " + "(" + locationOfMax[0] + ", " + locationOfMax[1] + ")");



    }


    public static double[][] createMatrix(int row, int column){
        Scanner scanner = new Scanner(System.in);
        double[][] matrix = new double[row][column];

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = scanner.nextDouble();
            }
        }

        return matrix;

    }


    public static int[] locateLargest(double[][] matrix){
        int rowIndexOfMax = 0;
        int columnIndexOfMax = 0;
        double max = matrix[0][0];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(max < matrix[i][j]){
                    max = matrix[i][j];
                    rowIndexOfMax = i;
                    columnIndexOfMax = j;
                }
            }
        }

        int[] location = {rowIndexOfMax,columnIndexOfMax};
        return location;
    }
}
