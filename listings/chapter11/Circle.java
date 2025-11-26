public class Circle extends GeometricObject {
    private double radius;

    public Circle() {
        this.radius = 1;
    }

    public Circle(double radius) {
        this.radius = radius;

    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public double getPerimeter() {
        return 2.0 * Math.PI * this.radius;

    }

    public double getDiameter() {
        return 2 * this.radius;
    }


    public String toString(){
        return "The circle is created " + getDateCreated() + " and the radius is " + radius;
    }


}
