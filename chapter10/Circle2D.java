public class Circle2D {
    private double x;
    private double y;
    private double radius;

    public Circle2D() {
        this(0, 0, 1);

    }

    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public double getPerimeter() {
        return this.radius * Math.PI * 2.0;
    }

    public boolean contains(double x, double y) {
        return Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2) < Math.pow(this.radius, 2);
    }

    public boolean contains(Circle2D circle) {
        return circle.radius <= this.radius && (Math.pow(circle.x - this.x, 2) + Math.pow(circle.y - this.y, 2) <= Math.pow(this.radius - circle.radius, 2));
    }

    public boolean overlaps(Circle2D circle) {
        return (Math.pow(circle.x - this.x, 2) + Math.pow(circle.y - this.y, 2)) < Math.pow(this.radius + circle.radius, 2);
    }


}
