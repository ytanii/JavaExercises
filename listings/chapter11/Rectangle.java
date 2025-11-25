public class Rectangle extends  GeometricObject{
    private double width;
    private double height;

    public Rectangle(){
        this.width = 1;
        this.height = 1;
    }

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled){
        this.width = width;
        this.height = height;
        setColor(color);
        setFilled(filled);
    }

    public double getWidth(){
        return this.width;
    }

    public void setWidth(double width){
        this.width = width;

    }

    public double getHeight(){
        return this.height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getArea(){
        return this.width * this.height;
    }

    public double getPerimeter(){
        return 2 * (this.width + this.height);
    }

}
