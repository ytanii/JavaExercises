public class MyRectangle2D {
    private double x;
    private double y;
    private double width;
    private double height;

    public MyRectangle2D() {
        this(0, 0, 1, 1);
    }

    public MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return 2 * (this.width + this.height);
    }

    public boolean contains(double x, double y) {
        return Math.abs(x - this.x) <= width / 2 && Math.abs(y - this.y) <= height / 2;
    }

    public boolean contains(MyRectangle2D r) {
        return Math.abs(r.x - this.x) + r.width / 2 <= this.width / 2 && Math.abs(r.y - this.y) + r.height / 2 <= this.height / 2;
    }

    public boolean overlaps(MyRectangle2D r) {
        if (Math.abs(r.x - this.x) >= (r.width / 2 + this.width / 2)) {
            return false;
        }
        if (Math.abs(r.y - this.y) >= (r.height / 2 + this.height / 2)) {
            return false;
        }
        return true;
    }

    public static MyRectangle2D getRectangle(double[][] points) {
        double minX = points[0][0];
        double maxX = points[0][0];
        double minY = points[0][1];
        double maxY = points[0][1];


        for (int i = 1; i < points.length; i++) {
            double x = points[i][0];
            double y = points[i][1];

            if (x < minX) {
                minX = x;
            }
            if (x > maxX) {
                maxX = x;
            }
            if (y < minY) {
                minY = y;
            }
            if (y > maxY) {
                maxY = y;
            }
        }

        double width = maxX - minX;
        double height = maxY - minY;
        double centerX = maxX - ((maxX - minX) / 2.0);
        double centerY = maxY - ((maxY - minY) / 2.0);

        return new MyRectangle2D(centerX, centerY, width, height);

    }
}