import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


public class Ex12_17_Hangman {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File file = new File("chapter12/words.txt");
        String[] words = readWordsFromFile(file);
        StringBuilder gameWordState = new StringBuilder();


        boolean continueGame = true;
        while (continueGame) {
            String word = words[(int) (Math.random() * words.length)].toLowerCase();
            int tries = 0;


            for (int i = 0; i < word.length(); i++) {
                gameWordState.append('*');
            }

            while (!word.equals(String.valueOf(gameWordState))) {


                System.out.println(gameWordState);

                System.out.print("\nMake a guess: ");
                char guess = Character.toLowerCase(scanner.nextLine().charAt(0));

                boolean doesAppear = false;
                for (int i = 0; i < word.length(); i++) {
                    if (guess == word.charAt(i)) {
                        if (word.charAt(i) == gameWordState.charAt(i)) {
                            System.out.println(guess + " is already in the word");
                            doesAppear = true;
                            break;
                        }
                        gameWordState.setCharAt(i, word.charAt(i));
                        doesAppear = true;
                    }
                }

                if (!doesAppear) {
                    System.out.println("    " + guess + " is not in the word");
                    tries++;
                }

            }

            printGuessSummary(tries, word);

            System.out.println("-----------");
            System.out.print("\nDo you want to continue (Yes or No)? ");
            continueGame = scanner.nextLine().equalsIgnoreCase("yes");
            gameWordState.setLength(0);


        }
    }

    public static void printGuessSummary(int tries, String word) {
        if (tries > 1) {
            System.out.println("The word was " + word + ", you made " + tries + " wrong guesses");


        } else if (tries == 1) {
            System.out.println("The word was " + word + ", you made " + tries + " wrong guess");
        } else {
            System.out.println("The word was " + word + ", you made no wrong guesses");

        }

    }

    public static String[] readWordsFromFile(File file) {
        ArrayList<String> list = new ArrayList<>();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                list.add(scanner.next());
            }


        } catch (Exception ex) {
            System.out.println("File not found");
        }

        return list.toArray(new String[0]);

    }


}
