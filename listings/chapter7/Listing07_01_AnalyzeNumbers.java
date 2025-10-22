import java.util.Scanner;

public class Listing07_01_AnalyzeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = scanner.nextInt();
        double[] listOfValues = new double[size];
        double sum = 0;

        System.out.println("Enter " + size + " values: ");
        for (int i = 0; i < listOfValues.length; i++) {
            listOfValues[i] = scanner.nextDouble();
            sum += listOfValues[i];
        }

        double average = sum / listOfValues.length;
        int numOfValuesBiggerThanAvg = 0;


        for (int i = 0; i < listOfValues.length; i++) {
            if (listOfValues[i] > average) {
                numOfValuesBiggerThanAvg++;

            }
        }

        System.out.println("The number of values bigger than the average of " + average + " is " + numOfValuesBiggerThanAvg);


    }

}
