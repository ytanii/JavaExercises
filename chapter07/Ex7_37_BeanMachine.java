import java.util.Scanner;

public class Ex7_37_BeanMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of balls to drop: ");
        int numberOfBalls = scanner.nextInt();

        System.out.print("Enter the number of slots in the bean machine: ");
        int numberOfSlots = scanner.nextInt();

        String[] ballPaths = simulateBeanMachine(numberOfBalls, numberOfSlots);
        int[] slots = new int[numberOfSlots];
        for (int i = 0; i < ballPaths.length; i++) {
            int count = 0;
            for (int j = 0; j < ballPaths[i].length(); j++) {
                if (ballPaths[i].charAt(j) == 'R') {
                    count++;
                }
            }
            slots[count]++;
        }

        for (String path : ballPaths) {
            System.out.println("  " + path);
        }
        System.out.println();

        for (int i = 0; i < findMax(slots); i++) {
            for (int j = 0; j < numberOfSlots; j++) {
                if (slots[j] >= findMax(slots) - i) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }


    public static String[] simulateBeanMachine(int numberOfBalls, int numberOfSlots) {
        String[] ballPaths = new String[numberOfBalls];
        for (int i = 0; i < numberOfBalls; i++) {
            String ballPath = "";
            for (int j = 0; j < numberOfSlots - 1; j++) {
                ballPath += (((int) (Math.random() * 2)) == 1 ? "L" : "R");
            }
            ballPaths[i] = ballPath;
        }
        return ballPaths;
    }

    public static int findMax(int[] slots) {
        int maxIndex = 0;
        for (int i = 1; i < slots.length; i++) {
            if (slots[maxIndex] < slots[i]) {
                maxIndex = i;
            }
        }
        return slots[maxIndex];
    }
}

