import java.util.Scanner;

public class Listing10_10_PalindromeIgnoreNonAlphanumeric {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string");
        String s = scanner.nextLine();

        if(isPalindrome(s)){
            System.out.println("The string is a palindrome");
        }else{
            System.out.println("The string is not a palindrome");
        }


    }

    public static String filter(String s){
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                stringBuilder.append(s.charAt(i));
            }

        }

        return stringBuilder.toString();
    }

    public static boolean isPalindrome(String s){

        String s1 = filter(s);

        String s2 = reverse(s1);

        return s2.equals(s1);
    }

    public static String reverse(String s){
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}
