import java.util.Scanner;

public class Ex7_35_Hangman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String randomWord = getRandomWord();
            char[] guess = new char[randomWord.length()];

            for (int i = 0; i < guess.length; i++) {
                guess[i] = '*';
            }

            int count = 0;
            boolean notMiss = false;
            int misses = 0;
            while (count < guess.length) {
                count = 0;
                notMiss = false;
                System.out.print("(Guess) Enter a letter in word " + String.valueOf(guess) + "> ");
                char guessLetter = scanner.next().toLowerCase().charAt(0);
                for (int i = 0; i < guess.length; i++) {
                    if (randomWord.charAt(i) == guessLetter) {
                        notMiss = true;
                        if (guess[i] != '*') {
                            System.out.println("     " + guessLetter + " is already in the word");
                            break;
                        }
                        guess[i] = randomWord.charAt(i);

                    }

                }

                if (!notMiss) {
                    System.out.println("     " + guessLetter + " is not in the word");
                    misses++;

                }
                for (int i = 0; i < guess.length; i++) {
                    if (guess[i] != '*') {
                        count++;
                    }
                }
            }

            System.out.println("The word is " + randomWord + ". You missed " + misses + (misses > 1 ? " times" : " time"));

            System.out.print("Do you want to guess another word? Enter y or n>");

            if (scanner.next().charAt(0) == 'n') {
                break;
            }
        }

    }

    public static String getRandomWord() {
        String[] words = {"apple", "planet", "river", "shadow", "mountain", "python", "laptop", "window", "puzzle", "coffee", "breeze", "silver", "galaxy", "mirror", "castle", "garden", "rocket", "island", "jungle", "thunder"};
        int index = (int) (Math.random() * words.length);
        return words[index];
    }
}
