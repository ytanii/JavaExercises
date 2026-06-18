public class TriangleWithException extends GeometricObject {
    private double side1, side2, side3;


    public TriangleWithException() throws IllegalTriangleException {
        this(1, 1, 1);
    }

    public TriangleWithException(double side1, double side2, double side3) throws IllegalTriangleException {
        if (sum(side1, side2) <= side3 || sum(side1, side3) <= side2 || sum(side2, side3) <= side1) {
            throw new IllegalTriangleException("Invalid triangle sides");
        } else {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }

    }

    public double getSide1() {
        return this.side1;
    }

    public double getSide2() {
        return this.side2;
    }

    public double getSide3() {
        return this.side3;
    }

    public double getArea() {
        double s = (this.side1 + this.side2 + this.side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

    }

    public double getPerimeter() {
        return this.side1 + this.side2 + this.side3;
    }

    @Override
    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }

    private static double sum(double operand1, double operand2) {
        return operand1 + operand2;

    }
}
