import java.util.Arrays;
import java.util.Scanner;

public class Ex7_17_SortStudents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int size = scanner.nextInt();

        String[] studentNames = new String[size];
        int[] studentScores = new int[size];

        System.out.println("Enter the students name followed by their score (Joe 80): ");

        for (int i = 0; i < studentNames.length; i++) {
            studentNames[i] = scanner.next();
            studentScores[i] = Integer.parseInt(scanner.next());
        }

        sortDecreasing(studentScores, studentNames);


        System.out.println("  Student Name        Score");
        for(int i = 0; i < studentNames.length; i++){
            System.out.printf("   %8s      %8d\n",studentNames[i], studentScores[i]);

        }


    }

    public static void sortDecreasing(int[] scores, String[] names) {
        for (int i = 0; i < scores.length - 1; i++) {
            int maxIndex = i;

            for (int j = i + 1; j < scores.length; j++) {
                if (scores[maxIndex] < scores[j]) {
                    maxIndex = j;
                }

            }

            int tempScore = scores[i];
            scores[i] = scores[maxIndex];
            scores[maxIndex] = tempScore;


            String tempName = names[i];
            names[i] = names[maxIndex];
            names[maxIndex] = tempName;

        }
    }
}
