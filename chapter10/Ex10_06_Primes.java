import java.util.Scanner;

public class Ex10_06_Primes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        StackOfIntegers stack = new StackOfIntegers();

        for (int i = 2; i < number; i++) {
            boolean isPrime = true;
            for (int divisor = 2; divisor <= Math.sqrt(i); divisor++) {
                if (i % divisor == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                stack.push(i);
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