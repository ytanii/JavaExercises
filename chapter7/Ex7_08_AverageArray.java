import java.util.Scanner;

public class Ex7_08_AverageArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] integers = new int[10];
        System.out.print("Enter 10 integers: ");
        for (int i = 0; i < integers.length; i++) {
            integers[i] = scanner.nextInt();
        }

        System.out.println("The average of the 10 integers is " + average(integers));

        double[] doubles = new double[10];
        System.out.print("Enter 10 doubles: ");
        for (int i = 0; i < doubles.length; i++) {
            doubles[i] = scanner.nextDouble();
        }

        System.out.println("The average of the 10 doubles is " + average(doubles));


    }

    public static double average(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];

        }
        return sum / array.length;
    }

    public static double average(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];

        }
        return sum / array.length;
    }
}
