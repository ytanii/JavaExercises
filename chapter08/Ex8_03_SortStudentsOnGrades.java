public class Ex8_03_SortStudentsOnGrades {
    public static void main(String[] args) {
        char[] answerKey = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};


        int[] gradeList = getScores(answers, answerKey);

        int[] studentNumber = {0, 1, 2, 3, 4, 5, 6, 7};

        for (int i = 0; i < gradeList.length; i++) {
            System.out.print("Student " + studentNumber[i] + "'s score is " + gradeList[i] + "\n");
        }


        sort(gradeList, studentNumber);

        System.out.println();

        System.out.println("After sorting low to high: ");

        for (int i = 0; i < gradeList.length; i++) {
            System.out.print("Student " + studentNumber[i] + "'s score is " + gradeList[i] + "\n");
        }


    }

    public static int[] getScores(char[][] answers, char[] answerKey) {
        int[] grades = new int[answers.length];
        for (int student = 0; student < answers.length; student++) {
            int score = 0;

            for (int question = 0; question < answers[student].length; question++) {
                if (answers[student][question] == answerKey[question]) {
                    score++;

                }
            }
            grades[student] = score;
        }
        return grades;

    }

    public static void sort(int[] scores, int[] studentNumber) {

        for (int n = 0; n < scores.length - 1; n++) {
            int min = scores[n];
            int indexOfMin = n;
            for (int i = n + 1; i < scores.length; i++) {
                if (min > scores[i]) {
                    min = scores[i];
                    indexOfMin = i;
                }

            }
            scores[indexOfMin] = scores[n];
            scores[n] = min;

            int helper = studentNumber[indexOfMin];
            studentNumber[indexOfMin] = studentNumber[n];
            studentNumber[n] = helper;
        }

    }

}
