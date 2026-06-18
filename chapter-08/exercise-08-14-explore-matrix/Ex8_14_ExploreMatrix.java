import java.util.Scanner;

public class Ex8_14_ExploreMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size for the matrix: ");
        int size = scanner.nextInt();
        int[][] matrix = createMatrix(size);

        displayMatrix(matrix);


        boolean isPrintedAtLeastOnceR = false;
        boolean isPrintedAtLeastOnceC = false;

        for(int i = 0; i < matrix.length; i++){
            if(isSameRow(matrix,i)){
                System.out.println("All " + matrix[i][0] + "s on row " + i);
                isPrintedAtLeastOnceR = true;
            }
            if(isSameColumn(matrix,i)){
                System.out.println("All " + matrix[0][i] + "s on column " + i);
                isPrintedAtLeastOnceC = true;
            }

        }

        if(!isPrintedAtLeastOnceR){
            System.out.println("No same numbers on a row");
        }

        if(!isPrintedAtLeastOnceC){
            System.out.println("No same numbers on a column");
        }

        if(isSameDiagonal(matrix)){
            System.out.println("All " + matrix[0][0] + "s on diagonal");
        }else{
            System.out.println("No same numbers on the major diagonal");
        }

        if(isSameSubDiagonal(matrix)){
            System.out.println("All " + matrix[0][matrix.length-1] + "s on sub diagonal");
        }else{
            System.out.println("No same numbers on the sub-diagonal");
        }


    }

    public static void displayMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

    }

    public static int[][] createMatrix(int size){
        int[][] matrix = new int[size][size];

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = (int)(Math.random()*2);
            }
        }

        return matrix;
    }

    public static boolean isSameRow(int[][] matrix, int row){
        int x = matrix[row][0];
        for(int i = 1; i < matrix[row].length; i++){
            if(matrix[row][i] != x){
                return false;
            }

        }

        return true;
    }
    public static boolean isSameColumn(int[][] matrix, int column){
        int x = matrix[0][column];
        for(int i = 1; i < matrix.length; i++){
            if(matrix[i][column] != x){
                return false;
            }

        }

        return true;
    }

    public static boolean isSameDiagonal(int[][] matrix){
        int x = matrix[0][0];
        for(int i = 1; i < matrix.length; i++){
           if(matrix[i][i] != x){
               return false;
           }
        }
        return true;
    }

    public static boolean isSameSubDiagonal(int[][] matrix){
        int x = matrix[0][matrix.length-1];
        for(int i = matrix.length-2,j = 1; i >= 0; i--, j++){
            if(matrix[j][i] != x){
                return false;
            }
        }
        return true;

    }
}
