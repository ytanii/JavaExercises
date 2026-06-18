import java.util.Arrays;
import java.util.Scanner;

public class Ex7_23_LockerPuzzle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean[] lockerStatusList = new boolean[100];


        for(int i = 1; i <= 100; i++){
            if(i == 1){
                for(int j = 0; j < lockerStatusList.length; j++){
                    lockerStatusList[j] = !lockerStatusList[j];
                }
            }else{
                for(int j = i - 1; j < lockerStatusList.length; j += i){
                        lockerStatusList[j] = !lockerStatusList[j];

                }

            }

        }


        System.out.print("Open lockers: ");
        for(int i = 0; i < lockerStatusList.length; i++){
            if(lockerStatusList[i]){
                System.out.print(i+1 + " ");
            }
        }

    }
}
