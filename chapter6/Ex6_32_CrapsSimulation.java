import java.util.Scanner;

public class Ex6_32_CrapsSimulation {


    public static void main(String[] args) {
        int wins = 0;
        for (int i = 0; i < 10000; i++) {
            if (isWinner()) {
                wins++;
            }

        }
        System.out.println(wins);

    }

    public static int resultOfRoll() {
        int roll1 = (int) (Math.random() * 6) + 1;
        int roll2 = (int) (Math.random() * 6) + 1;
        return roll1 + roll2;
    }

    public static boolean isWinner() {
        int rollNumber = resultOfRoll();
        if (rollNumber == 7 || rollNumber == 11) {

            return true;
        } else if (rollNumber == 2 || rollNumber == 3 || rollNumber == 12) {

            return false;
        } else {
            int point = rollNumber;
            int newRollNumber = resultOfRoll();
            while (newRollNumber != 7 && newRollNumber != point) {
                newRollNumber = resultOfRoll();
            }
            return newRollNumber == point;
        }


    }
}
