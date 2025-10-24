import java.util.Scanner;

public class Ex7_28_Combinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];
        System.out.print("Enter 10 integers: ");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int combinationCount = 0;
        for (int i = 0; i < numbers.length; i++) {

            for (int j = 1 + i; j < numbers.length; j++) {
                System.out.println(numbers[i] + " " + numbers[j]);
            }

        }
    }

}
