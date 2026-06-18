import java.util.Scanner;

public class Ex10_05_PrimeFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        StackOfIntegers stack = new StackOfIntegers();

        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                stack.push(i);
                number /= i;
            }
        }
        while (!stack.empty()) {
            int topNumber = stack.pop();
            if (stack.empty()) {
                System.out.print(topNumber);
            } else {
                System.out.print(topNumber + ", ");
            }
        }

    }
}
