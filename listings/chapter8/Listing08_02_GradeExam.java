public class Listing08_02_GradeExam {
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


        String[] gradeList = gradeStudents(answers, answerKey);
        for (int i = 0; i < gradeList.length; i++) {
            System.out.println(gradeList[i]);
        }


    }

    public static String[] gradeStudents(char[][] answers, char[] answerKey) {
        String[] grades = new String[answers.length];
        for (int student = 0; student < answers.length; student++) {
            int score = 0;
            for (int question = 0; question < answers[student].length; question++) {
                if (answers[student][question] == answerKey[question]) {
                    score++;
                }

            }
            grades[student] = "Student " + (student) + ": " + score + " correct";
        }
        return grades;

    }

}
