import java.util.ArrayList;
import java.math.*;

public class Listing13_05_LargestNumber {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();
        list.add(45);
        list.add(3445.53);
        list.add(new BigInteger("3432323234344343101"));
        list.add(new BigDecimal("2.0909090989091343433344343"));

        System.out.print("The largest number is " + getLargestNumber(list));

    }

    public static Number getLargestNumber(ArrayList<Number> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }

        int maxIndex = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(maxIndex).doubleValue() < list.get(i).doubleValue()) {
                maxIndex = i;
            }
        }

        return list.get(maxIndex);
    }
}
