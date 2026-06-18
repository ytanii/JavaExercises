import java.util.Scanner;

public class Ex6_30_Craps {
    static int roll1;
    static int roll2;

    public static void main(String[] args) {
        if (isWinner()) {
            System.out.println("You win");
        } else {
            System.out.println("You lose");
        }

    }

    public static int resultOfRoll() {
        roll1 = (int) (Math.random() * 6) + 1;
        roll2 = (int) (Math.random() * 6) + 1;
        return roll1 + roll2;
    }

    public static boolean isWinner() {
        int rollNumber = resultOfRoll();
        if (rollNumber == 7 || rollNumber == 11) {
            System.out.println("You rolled " + roll1 + " + " + roll2 + " = " + rollNumber);
            return true;
        } else if (rollNumber == 2 || rollNumber == 3 || rollNumber == 12) {
            System.out.println("You rolled " + roll1 + " + " + roll2 + " = " + rollNumber);
            return false;
        } else {
            System.out.println("You rolled " + roll1 + " + " + roll2 + " = " + rollNumber);
            int point = rollNumber;
            System.out.println("Point is " + point);
            int newRollNumber = resultOfRoll();
            while (newRollNumber != 7 && newRollNumber != point) {
                newRollNumber = resultOfRoll();
            }
            System.out.println("You rolled " + roll1 + " + " + roll2 + " = " + newRollNumber);
            return newRollNumber == point;
        }


    }
}
