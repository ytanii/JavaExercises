import java.util.ArrayList;
import java.util.Scanner;

public class Ex11_16_AdditionQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1;
        int number2;
        int answer;
        ArrayList<Integer> userAnswers = new ArrayList<>();
        number1 = (int) (Math.random() * 10);
        number2 = (int) (Math.random() * 10);
        System.out.print("What is " + number1 + " + " + number2 + "? ");
        int userAnswer = scanner.nextInt();
        userAnswers.add(userAnswer);

        while (number1 + number2 != userAnswer) {
            System.out.print("Wrong answer. Try again. " + "What is " + number1 + " + " + number2 + "? ");

            userAnswer = scanner.nextInt();
            if (userAnswers.contains(userAnswer)) {
                System.out.println("You already entered " + userAnswer);
            }
            userAnswers.add(userAnswer);


        }
        System.out.println("You got it!");

    }
    }
