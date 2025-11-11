public class newCircle{
    double radius;
    static int numberOfObjects = 0;

    newCircle(){
        radius = 1;
        numberOfObjects++;
    }

    newCircle(double newRadius){
        radius = newRadius;
        numberOfObjects++;
    }

    static int getNumberOfObjects(){
        return numberOfObjects;
    }

    double getArea(){
        return radius * radius * Math.PI;
    }

}