import java.util.Scanner;

public class Ex9_10_QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter values for a, b, c as a b c");
        QuadraticEquation equation = new QuadraticEquation(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());

        double discriminant = equation.getDiscriminant();

        if (discriminant >= 0) {
            if (discriminant == 0) {
                System.out.println("root: " + equation.getRoot1());
            } else {
                System.out.println("root1: " + equation.getRoot1() + ", root2: " + equation.getRoot2());
            }
        } else {
            System.out.println("The equation has no roots.");
        }

    }
}
