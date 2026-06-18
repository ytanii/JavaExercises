package exercise05;

public class SumSeries {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("m(" + i + ") = " + sum(i));
        }

    }

    public static double sum(int n) {
        if (n == 0) {
            return 0;
        } else {
            return (n / ((2.0 * n) + 1)) + sum(n - 1);
        }
    }

}
