import java.util.Scanner;

public class Ex7_11_ComputeDeviation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbers = new double[10];
        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextDouble();
        }
        System.out.printf("The mean is %.2f\n", mean(numbers));
        System.out.printf("The standard deviation is %.5f\n", deviation(numbers));

    }

    public static double deviation(double[] x) {
        double average = mean(x);
        double numerator = 0;
        for (int i = 0; i < x.length; i++) {
            numerator += Math.pow(x[i] - average, 2);

        }
        return Math.sqrt(numerator / (x.length - 1));

    }

    public static double mean(double[] x) {
        double sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        return sum / x.length;
    }
}
