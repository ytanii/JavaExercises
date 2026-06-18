public class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;


    public Triangle() {
        this(3, 4, 5);
    }

    public Triangle(double side1, double side2, double side3) {
        if (isValidTriangle(side1, side2, side3)) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            throw new IllegalArgumentException("Invalid triangle side lengths");
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


    private boolean isValidTriangle(double side1, double side2, double side3) {
        boolean req1 = side1 + side2 > side3;
        boolean req2 = side2 + side3 > side1;
        boolean req3 = side3 + side1 > side2;

        return req1 && req2 && req3;

    }


    @Override
    public double getArea() {
        double semiperimeter = (this.side1 + this.side2 + this.side3) / 2.0;
        double area = Math.sqrt(semiperimeter * (semiperimeter - this.side1) * (semiperimeter - this.side2) * (semiperimeter - this.side3));

        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = this.side1 + this.side2 + this.side3;

        return perimeter;
    }

    @Override
    public String toString() {
        return "side1 = " + this.side1 + ", side2 = " + this.side2 + ", side3 = " + this.side3;
    }
}
