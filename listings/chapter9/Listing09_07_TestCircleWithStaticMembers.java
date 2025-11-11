public class Listing09_07_TestCircleWithStaticMembers {
    public static void main(String[] args){
        System.out.println("Before creating objects");
        System.out.println("The number of Circle objects is " + newCircle.numberOfObjects);
        newCircle circle1 = new newCircle();

        System.out.println();
        System.out.println("After creating circle1 ");
        System.out.println("circle1 radius: " + circle1.radius);
        System.out.println("The number of objects: " + newCircle.numberOfObjects);

        newCircle circle2 = new newCircle(5);

        circle1.radius = 9;

        System.out.println();

        System.out.println("After creating circle2 and changing circle1");
        System.out.println("circle1 radius: " + circle1.radius);
        System.out.println("The number of objects: " + newCircle.numberOfObjects);
        System.out.println("circle2 radius; " + circle2.radius);
        System.out.println("The number of objects: " + newCircle.numberOfObjects);

    }
}
