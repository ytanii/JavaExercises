import java.util.Scanner;

public class Ex7_22_CountUppercaseLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        if(args.length == 0){
            System.out.println("Enter a string");
            System.exit(1);
        }
        String str = args[0];
        int upperCaseLetterCount = 0;
        for(int i = 0; i < str.length(); i++){
            if(Character.isUpperCase(str.charAt(i))){
                upperCaseLetterCount++;
            }
        }

        System.out.println("The number of uppercase letters in the string is " + upperCaseLetterCount);

    }
}
