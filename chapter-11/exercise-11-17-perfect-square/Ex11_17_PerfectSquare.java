import java.util.ArrayList;
import java.util.Scanner;

public class Ex11_17_PerfectSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integer m: ");
        int m = scanner.nextInt();
        ArrayList<Integer> divisors = new ArrayList<>();

        int i = 2;
        int helper = m;

        while (helper > 1) {
            while (helper % i == 0) {
                helper /= i;
                divisors.add(i);
            }
            i++;
        }

        int count = 0;
        int n = 1;

        while (!divisors.isEmpty()) {
            int number = divisors.getFirst();
            count = 0;
            while (!divisors.isEmpty() && divisors.contains(number)) {
                count++;
                divisors.remove(Integer.valueOf(number));
            }
            if (count % 2 != 0) {
                n *= number;
            }
        }

        System.out.println("The smallest number n for m * n to be a perfect square is " + n + " m * n is " + (m * n));
    }

}
