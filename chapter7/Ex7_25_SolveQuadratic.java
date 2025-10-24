import java.util.Scanner;

public class Ex7_25_SolveQuadratic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double[] roots = new double[0];
        double[] equation = new double[3];


        System.out.print("Enter the coefficients for a quadratic equation as a b c in order: ");
        for (int i = 0; i < equation.length; i++) {
            equation[i] = scanner.nextDouble();
        }

        double a = equation[0];
        double b = equation[1];
        double c = equation[2];

        if (Math.pow(b, 2.0) - (4.0 * a * c) > 0) {
            roots = new double[2];


        } else if (Math.pow(b, 2.0) - (4.0 * a * c) == 0) {
            roots = new double[1];
        } else {
            System.out.println("No real roots exist");
            System.exit(1);
        }

        int numberOfRoots = solveQuadratic(equation, roots);

        System.out.println("Number of real roots: " + numberOfRoots);
        System.out.print("The roots are: ");
        for (double root : roots) {
            System.out.print(root + " ");
        }


    }

    public static int solveQuadratic(double[] equation, double[] roots) {
        double a = equation[0];
        double b = equation[1];
        double c = equation[2];
        if (roots.length == 2) {
            double root1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
            double root2 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
            roots[0] = root1;
            roots[1] = root2;

        } else {
            double root1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
            roots[0] = root1;
        }


        return roots.length;
    }
}
