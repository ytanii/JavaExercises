import java.util.ArrayList;
import java.util.Arrays;

public class Ex11_07_Shuffle {
    public static void main(String[] args) {

        Integer[] array = {3, 5, 95, 4, 15, 34, 3, 6, 5};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));

        shuffle(list);
        System.out.println(list);
    }

    public static void shuffle(ArrayList<Integer> list) {

        for (int i = list.size() - 1; i > 0; i--) {
            int j = (int) (Math.random() * (i + 1));
            int helper = list.get(i);
            list.set(i, list.get(j));
            list.set(j, helper);
        }
    }
}
