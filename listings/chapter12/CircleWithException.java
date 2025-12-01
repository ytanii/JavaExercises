public class CircleWithException {
    private double radius;
    private static int numberOfObjects = 0;


    public CircleWithException(){
        this(1.0);
    }
    public CircleWithException(double radius){
        setRadius(radius);
        numberOfObjects++;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius) throws IllegalArgumentException{
        if(radius >= 0){
            this.radius = radius;
        }else{
            throw new IllegalArgumentException("Radius cannot be negative");
        }
    }

    public static int getNumberOfObjects(){
        return numberOfObjects;
    }

    public double getArea(){
        return this.radius * this.radius * Math.PI;
    }
}
