import java.math.BigInteger;
import java.util.ArrayList;

public class Ex13_02_ShuffleArrayList {
    public static void main(String[] args) {

        ArrayList<Number> numbers = new ArrayList<>();

        numbers.add(42);

        numbers.add(42);
        numbers.add(3.14);
        numbers.add(2.718f);
        numbers.add(123456789L);
        numbers.add((short) 7);
        numbers.add((byte) 1);
        numbers.add(new BigInteger("9999"));

        System.out.println(numbers);

        shuffle(numbers);

        System.out.println(numbers);
    }

    public static void shuffle(ArrayList<Number> list) {
        for (int i = list.size() - 1; i > 0; i--) {
            int randomIndex = (int) (Math.random() * (i + 1));
            Number helper = list.get(i);
            list.set(i, list.get(randomIndex));
            list.set(randomIndex,helper);
        }

    }
}
