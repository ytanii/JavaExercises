
import java.awt.geom.Line2D;

public class Triangle2D {
    private MyPoint p1;
    private MyPoint p2;
    private MyPoint p3;

    public Triangle2D() {
        this(new MyPoint(0, 0), new MyPoint(1, 1), new MyPoint(2, 5));
    }

    public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public double getArea() {
        double a = this.p1.distance(this.p2);
        double b = this.p1.distance(this.p3);
        double c = this.p2.distance(this.p3);
        double s = 0.5 * (a + b + c);
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));

    }

    public double getPerimeter() {
        double a = this.p1.distance(this.p2);
        double b = this.p1.distance(this.p3);
        double c = this.p2.distance(this.p3);
        return a + b + c;

    }

    public boolean contains(MyPoint p) {
        double a = this.p1.distance(this.p2);
        double b = this.p1.distance(this.p3);
        double c = this.p2.distance(this.p3);
        double aP = p.distance(this.p1);
        double bP = p.distance(this.p2);
        double cP = p.distance(this.p3);

        double s1 = 0.5 * (aP + bP + a);
        double s2 = 0.5 * (aP + cP + b);
        double s3 = 0.5 * (bP + cP + c);

        double area1 = Math.sqrt(s1 * (s1 - a) * (s1 - aP) * (s1 - bP));
        double area2 = Math.sqrt(s2 * (s2 - b) * (s2 - aP) * (s2 - cP));
        double area3 = Math.sqrt(s3 * (s3 - c) * (s3 - bP) * (s3 - cP));

        double sum = area1 + area2 + area3;
        double area = this.getArea();

        return Math.abs(sum - area) < 1e-9;
    }

    public boolean contains(Triangle2D t) {
        return this.contains(t.p1) && this.contains(t.p2) && this.contains(t.p3);
    }

    public boolean overlaps(Triangle2D t) {

        Line2D line1 = new Line2D.Double(t.p1.getX(), t.p1.getY(), t.p2.getX(), t.p2.getY());
        Line2D line2 = new Line2D.Double(t.p1.getX(), t.p1.getY(), t.p3.getX(), t.p3.getY());
        Line2D line3 = new Line2D.Double(t.p2.getX(), t.p2.getY(), t.p3.getX(), t.p3.getY());

        Line2D side1 = new Line2D.Double(p1.getX(), p1.getY(), p2.getX(), p2.getY());
        Line2D side2 = new Line2D.Double(p1.getX(), p1.getY(), p3.getX(), p3.getY());
        Line2D side3 = new Line2D.Double(p2.getX(), p2.getY(), p3.getX(), p3.getY());

        return contains(t) || t.contains(this) ||
                line1.intersectsLine(side1) ||
                line1.intersectsLine(side2) ||
                line1.intersectsLine(side3) ||
                line2.intersectsLine(side1) ||
                line2.intersectsLine(side2) ||
                line2.intersectsLine(side3) ||
                line3.intersectsLine(side1) ||
                line3.intersectsLine(side2) ||
                line3.intersectsLine(side3);
    }

}
