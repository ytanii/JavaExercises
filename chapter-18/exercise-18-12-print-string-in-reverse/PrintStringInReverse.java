package exercise12;

import java.util.Scanner;

public class PrintStringInReverse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();
        reverseDisplay(str);
    }

    public static void reverseDisplay(String str){
        reverseDisplay(str,str.length()-1);
    }
    public static void reverseDisplay(String str, int high){
        if(high < 0){
            return;
        }
        System.out.print(str.charAt(high));
        reverseDisplay(str,high-1);
    }
}
