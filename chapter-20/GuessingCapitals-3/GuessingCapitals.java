import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GuessingCapitals {
    public static void main(String[] args){
        ArrayList<String[]> list = new ArrayList<>();

        list.add(new String[]{"Alabama", "Montgomery"});
        list.add(new String[]{"Alaska", "Juneau"});
        list.add(new String[]{"Arizona", "Phoenix"});
        list.add(new String[]{"Arkansas", "Little Rock"});
        list.add(new String[]{"California", "Sacramento"});
        list.add(new String[]{"Colorado", "Denver"});
        list.add(new String[]{"Connecticut", "Hartford"});
        list.add(new String[]{"Delaware", "Dover"});
        list.add(new String[]{"Florida", "Tallahassee"});
        list.add(new String[]{"Georgia", "Atlanta"});
        list.add(new String[]{"Hawaii", "Honolulu"});
        list.add(new String[]{"Idaho", "Boise"});
        list.add(new String[]{"Illinois", "Springfield"});
        list.add(new String[]{"Indiana", "Indianapolis"});
        list.add(new String[]{"Iowa", "Des Moines"});
        list.add(new String[]{"Kansas", "Topeka"});
        list.add(new String[]{"Kentucky", "Frankfort"});
        list.add(new String[]{"Louisiana", "Baton Rouge"});
        list.add(new String[]{"Maine", "Augusta"});
        list.add(new String[]{"Maryland", "Annapolis"});
        list.add(new String[]{"Massachusetts", "Boston"});
        list.add(new String[]{"Michigan", "Lansing"});
        list.add(new String[]{"Minnesota", "Saint Paul"});
        list.add(new String[]{"Mississippi", "Jackson"});
        list.add(new String[]{"Missouri", "Jefferson City"});
        list.add(new String[]{"Montana", "Helena"});
        list.add(new String[]{"Nebraska", "Lincoln"});
        list.add(new String[]{"Nevada", "Carson City"});
        list.add(new String[]{"New Hampshire", "Concord"});
        list.add(new String[]{"New Jersey", "Trenton"});
        list.add(new String[]{"New Mexico", "Santa Fe"});
        list.add(new String[]{"New York", "Albany"});
        list.add(new String[]{"North Carolina", "Raleigh"});
        list.add(new String[]{"North Dakota", "Bismarck"});
        list.add(new String[]{"Ohio", "Columbus"});
        list.add(new String[]{"Oklahoma", "Oklahoma City"});
        list.add(new String[]{"Oregon", "Salem"});
        list.add(new String[]{"Pennsylvania", "Harrisburg"});
        list.add(new String[]{"Rhode Island", "Providence"});
        list.add(new String[]{"South Carolina", "Columbia"});
        list.add(new String[]{"South Dakota", "Pierre"});
        list.add(new String[]{"Tennessee", "Nashville"});
        list.add(new String[]{"Texas", "Austin"});
        list.add(new String[]{"Utah", "Salt Lake City"});
        list.add(new String[]{"Vermont", "Montpelier"});
        list.add(new String[]{"Virginia", "Richmond"});
        list.add(new String[]{"Washington", "Olympia"});
        list.add(new String[]{"West Virginia", "Charleston"});
        list.add(new String[]{"Wisconsin", "Madison"});
        list.add(new String[]{"Wyoming", "Cheyenne"});

        startQuiz(list);

    }

    public static void startQuiz(ArrayList<String[]> list){
        Collections.shuffle(list);
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        for(String[] pair : list){
            System.out.println("What is the capital of " + pair[0] + "?");
            String answer = scanner.nextLine();
            if(answer.equalsIgnoreCase(pair[1])){
                System.out.println("Your answer is correct");
                score++;
            }else{
                System.out.println("The correct answer should be " + pair[1]);
            }
        }


        System.out.println("The correct count is " + score);
    }


}
