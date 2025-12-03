import java.util.Arrays;

public class Listing13_10_SortRectangles {
    public static void main(String[] args){
        ComparableRectangle[] rectangles = {
                new ComparableRectangle(3.4,5.4),
                new ComparableRectangle(13.24, 55.4),
                new ComparableRectangle(7.4, 35.4),
                new ComparableRectangle(1.4, 25.4)
        };

        ComparableRectangle rectangle1 =  new ComparableRectangle(3,6);
        ComparableRectangle rectangle2 = new ComparableRectangle(3 , 6);
        System.out.println(rectangle1.equals(rectangle2));

        Arrays.sort(rectangles);

        for(Rectangle rectangle: rectangles){
            System.out.print(rectangle + " ");
            System.out.println();
        }




    }
}
