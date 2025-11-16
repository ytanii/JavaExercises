import java.util.Scanner;

public class Ex10_05_PrimeFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        int[] factors= factor(number);
        StackOfIntegers stack = new StackOfIntegers(factors.length);

        for(int i  = 0; i < factors.length; i++){
            stack.push(factors[i]);
        }

        while(!stack.empty()){
            System.out.print(stack.pop());
            if(!stack.empty()){
                System.out.print(", ");
            }
        }
        System.out.println();

    }

    public static int[] factor(int number) {
        if(number == 1){
            return new int[] {};
        }

        int count = 0;
        int temp = number;
        for(int i = 2; i <= temp; i++){
            while(temp % i == 0){
                count++;
                temp /= i;
            }
        }

        int[] factors = new int[count];
        int index = 0;
        for(int i = 2; i <= number; i++){
            while(number % i == 0){
                factors[index++] = i;
                number /= i;
            }
        }

        return factors;
    }
}
