import java.util.Scanner;

public class Ex8_30_LinearEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 linear equations to solve (for example ax + bx = c, enter a b c): ");
        double[][] equations = new double[2][3];

        for (int i = 0; i < equations.length; i++) {
            for (int j = 0; j < equations[i].length; j++) {
                equations[i][j] = scanner.nextDouble();

            }
        }

        double[] b = new double[2];
        b[0] = equations[0][2];
        b[1] = equations[1][2];
        double[][] a = new double[2][2];
        a[0][0] = equations[0][0];
        a[0][1] = equations[0][1];
        a[1][0] = equations[1][0];
        a[1][1] = equations[1][1];

        if(linearEquation(a,b) != null) {
            double[] solution = linearEquation(a, b);
            System.out.println("x is " + solution[0]);
            System.out.println("y is " + solution[1]);
        }else{
            System.out.println("The equation has no solution");
        }

    }

    public static double[] linearEquation(double[][] a, double[] b) {
        double denominator = a[0][0] * a[1][1] - a[0][1] * a[1][0];
        if (denominator == 0) {
            return null;
        }
        double x = ((b[0] * a[1][1]) - (b[1] * a[0][1])) / denominator;
        double y =((b[1] * a[0][0]) - (b[0] * a[1][0]))/ denominator;
        return new double[]{x,y};
    }
}
