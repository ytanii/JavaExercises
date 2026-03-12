import java.util.Arrays;
import java.util.Scanner;

public class Ex7_13_RandomNumberChooser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for(int i = 1; i <= 45; i++){
            System.out.printf("%4d",getRandom(1,100,4,8,95,93));
            if(i % 15 == 0){
                System.out.println();
            }
        }


    }

    public static int getRandom(int start, int end, int... numbers){
            int randomNumber;
            boolean excluded;

            do{
                randomNumber = (int)((Math.random()*(end - start + 1)) + start);
                excluded = false;
                for(int n : numbers){
                    if(randomNumber == n){
                        excluded = true;
                        break;
                    }
                }

            }while(excluded);

            return randomNumber;

    }
}
