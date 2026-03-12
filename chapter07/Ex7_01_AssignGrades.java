import java.util.Scanner;

public class Ex7_01_AssignGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int size = scanner.nextInt();

        int[] scores = new int[size];

        System.out.print("Enter " + size + " scores: ");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = scanner.nextInt();

        }

        displayGrades(scores);


    }

    public static int getMaxScore(int[] scores) {
        int max = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (max < scores[i]) {
                max = scores[i];
            }
        }
        return max;
    }

    public static char getGrade(int[] scores, int studentNumber) {
        int best = getMaxScore(scores);

        if (scores[studentNumber] >= best - 10) {
            return 'A';

        } else if (scores[studentNumber] >= best - 20) {
            return 'B';
        } else if (scores[studentNumber] >= best - 30) {
            return 'C';
        } else if (scores[studentNumber] >= best - 40) {
            return 'D';
        } else {
            return 'F';
        }

    }

    public static void displayGrades(int[] scores) {
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + getGrade(scores, i));
        }
    }
}
