import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Calendar;

public class Ex13_03_SortArrayList {
    public static void main(String[] args) {

        ArrayList<Number> numbers = new ArrayList<>();

        numbers.add(42);
        numbers.add(3.14);
        numbers.add(2.718);
        numbers.add(new BigInteger("12345678312313123132131232312312312312233123992139192391929"));
        numbers.add(7);
        numbers.add(1);
        numbers.add(new BigDecimal("999999999999999999999.3213213123123312312312321312312312312321"));
        numbers.add(42);

        System.out.println(numbers);

        sort(numbers);

        System.out.println(numbers);


    }

    public static void sort(ArrayList<Number> list) {
        for (int i = 0; i < list.size(); i++) {
            int minIndex = i;
            for (int j = i + 1; j < list.size(); j++) {
                if ((list.get(i) instanceof BigDecimal ? (BigDecimal) list.get(i) : new BigDecimal(list.get(i).toString())).compareTo(list.get(j) instanceof BigDecimal ? (BigDecimal) list.get(j) : new BigDecimal(list.get(j).toString())) > 0) {
                    minIndex = j;
                }
            }
            BigDecimal helper = new BigDecimal(list.get(i).toString());
            list.set(i, list.get(minIndex));
            list.set(minIndex, helper);
        }
    }
}
