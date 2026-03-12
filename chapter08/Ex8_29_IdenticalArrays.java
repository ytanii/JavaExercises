import java.util.Scanner;
import java.util.Arrays;

public class Ex8_29_IdenticalArrays {
    public static void main(String[] args) {
        System.out.print("Enter list1: ");
        int[][] m1 = getMatrix();
        System.out.print("Enter list2: ");
        int[][] m2 = getMatrix();

        if (equals(m1, m2))
            System.out.println("The two arrays are identical");
        else
            System.out.println("The two arrays are not identical");
    }

    public static int[][] getMatrix() {
        Scanner input = new Scanner(System.in);
        int[][] m = new int[3][3];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = input.nextInt();
            }
        }
        return m;
    }

    public static boolean equals(int[][] m1, int[][] m2) {
        int[] a = new int[m1.length * m1[0].length];
        int[] b = new int[m2.length * m2[0].length];
        int k = 0;
        for (int[] row : m1) {
            for (int n : row) {
                a[k++] = n;
            }
        }
        k = 0;
        for (int[] row : m2) {
            for (int n : row) {
                b[k++] = n;
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }
}