import java.util.ArrayList;
import java.util.Scanner;

public class Ex11_12_SumArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(scanner.nextDouble());
        }

        double sum = sum(list);

        System.out.println("The sum of all 5 numbers is " + sum);

    }

    public static double sum(ArrayList<Double> list) {
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }
}
