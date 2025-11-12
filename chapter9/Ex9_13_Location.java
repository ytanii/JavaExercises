import java.util.Scanner;

public class Ex9_13_Location {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns in the array: ");
        double[][] matrix = new double[scanner.nextInt()][scanner.nextInt()];

        System.out.println("Enter the array: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        Location location = Location.locateLargest(matrix);

        System.out.println("The location of the largest element is " + location.maxValue + " at " + "(" + location.row + ", " + location.column + ")");

    }
}
