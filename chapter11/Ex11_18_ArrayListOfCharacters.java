import java.util.ArrayList;

public class Ex11_18_ArrayListOfCharacters {
    public static void main(String[] args){

        System.out.println(toCharacterArray("abcdef"));

    }

    public static ArrayList<Character> toCharacterArray(String s){
        ArrayList<Character> charList = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            charList.add(s.charAt(i));
        }

        return charList;
    }
}
