import java.util.Scanner;

public class Ex7_04_AnalyzeScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] scores = new double[100];
        double sum = 0;
        int count = 0;

        for (int i = 0; i < scores.length; i++) {
            double input = scanner.nextDouble();
            if (input < 0) {
                break;
            }
            scores[i] = input;
            sum += input;
            count++;
        }

        double average = sum / count;
        int countAboveAverage = 0;
        int countBelowAverage = 0;
        int countAverage = 0;

        for (int i = 0; i < count; i++) {
            if (scores[i] < average) {
                countBelowAverage++;
            } else if (scores[i] == average) {
                countAverage++;

            } else {
                countAboveAverage++;
            }

        }

        System.out.println("Number of scores above the average of " + average + " is " + countAboveAverage);
        System.out.println("Number of scores below the average of " + average + " is " + countBelowAverage);
        if (countAverage > 0) {
            System.out.println("Number of scores equal to the average of " + average + " is " + countAverage);


        }


    }
}
