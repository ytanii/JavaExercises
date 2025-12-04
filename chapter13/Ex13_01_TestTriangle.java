import java.util.Scanner;

public class Ex13_01_TestTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three side lengths for a triangle (input as: side1 side2 side3): ");
        double side1 = scanner.nextInt();
        double side2 = scanner.nextInt();
        double side3 = scanner.nextInt();

        System.out.print("Enter a color: ");
        String color = scanner.next();

        System.out.print("Enter a filled state (true or false):");
        boolean filled = scanner.nextBoolean();

        try {
            Triangle triangle = new Triangle(side1, side2, side3);
            triangle.setColor(color);
            triangle.setFilled(filled);
            System.out.println("Triangle with side lengths of " + triangle + "has the properties:");
            System.out.println("Perimeter = " + triangle.getPerimeter());
            System.out.println("Area = " + triangle.getArea());
            System.out.println("Color: " + triangle.getColor());
            System.out.println("Filled: " + triangle.isFilled());
        }catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }



    }
}
