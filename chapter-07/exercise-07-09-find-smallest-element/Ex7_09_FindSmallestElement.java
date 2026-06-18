import java.util.Scanner;

public class Ex7_09_FindSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.print("Enter 10 doubles: ");
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = scanner.nextDouble();
        }
        System.out.println("The min is " + min(numbers));

    }

    public static double min(double[] array){
        double min = array[0];
        for(int i = 1; i < array.length; i++){
            if(min > array[i]){
                min = array[i];
            }
        }
        return min;
    }
}
