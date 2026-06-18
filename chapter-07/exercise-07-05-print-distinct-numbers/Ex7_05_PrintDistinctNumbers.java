import java.util.Scanner;

public class Ex7_05_PrintDistinctNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];

        System.out.print("Enter 10 numbers: ");
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = scanner.nextInt();
        }

        int[] distinctNumbers = new int[10];
        int count = 0;

        for(int i = 0; i < numbers.length; i++){
            boolean isDistinct = true;
            for(int j = 0; j < distinctNumbers.length; j++){
                if(distinctNumbers[j] == numbers[i]){
                    isDistinct = false;
                    break;
                }

            }
            if(isDistinct){
                distinctNumbers[count] = numbers[i];
                count++;
            }

        }

        System.out.println("The number of distinct numbers is " + count);
        System.out.print("The distinct numbers are: ");
        for(int i = 0; i < count; i++){
                System.out.print(distinctNumbers[i] + " ");
            }
        }

    }

