import java.util.Scanner;

public class Ex7_21_SumIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalSum = 0;
        for (String number : args) {
            totalSum += Integer.parseInt(number);

        }

        System.out.println("The total is " + totalSum);

    }
}
