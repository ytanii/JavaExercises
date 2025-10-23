import java.util.Scanner;

public class Ex7_07_CountSingleDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] counts = new int[10];

        for(int i = 0; i < 100; i++) {
            counts[(int) (Math.random() * 10)]++;
        }


        for(int i = 0; i < counts.length; i++){

            System.out.println(i + " occurs " + counts[i] + (counts[i] > 1 ? " times" : " time"));
        }
    }
}
