import java.util.Random;
import java.util.Scanner;

public class Ex9_04_UseRandom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random generator = new Random(1000);

        for (int i = 0; i < 50; i++) {
            System.out.println(generator.nextInt(100));
        }

    }
}
