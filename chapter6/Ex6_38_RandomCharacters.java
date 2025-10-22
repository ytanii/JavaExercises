import java.util.Scanner;

public class Ex6_38_RandomCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for(int i = 1; i <= 100; i++){
            printRandomUppercaseLetter();
            if(i % 50 == 0){
                System.out.println();
            }
        }
        for(int i = 1; i <= 100; i++){
            printRandomDigit();
            if(i % 50 == 0){
                System.out.println();
            }
        }


    }

    public static void printRandomUppercaseLetter(){
        System.out.print(generateRandomCharacter('A','Z'));
    }

    public static void printRandomDigit(){
        System.out.print(generateRandomCharacter('0','9'));
    }

    public static char generateRandomCharacter(char ch1, char ch2){
        return (char)((Math.random()*(ch2 - ch1))+ch1);
    }

}
