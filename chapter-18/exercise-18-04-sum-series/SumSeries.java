package exercise04;

import java.util.Scanner;

public class SumSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for(int i = 1; i <= 10; i++){
            System.out.println("m(" + i + ") = " + sum(i));
        }

    }

    public static double sum(int n) {
        if(n == 1){
            return 1;
        }else {
            return (1.0 / n) + sum(n - 1);
        }
    }

}

