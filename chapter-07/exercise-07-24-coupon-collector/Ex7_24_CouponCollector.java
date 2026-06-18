import java.util.Scanner;

public class Ex7_24_CouponCollector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] deckofCards = new int[52];
        for (int i = 0; i < deckofCards.length; i++) {
            deckofCards[i] = i;
        }
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Queen", "King", "Jack"};

        shuffle(deckofCards);

        boolean[] isPickedList = new boolean[4];
        int numberOfCardsPicked = 0;
        int suitsPicked = 0;


        while (suitsPicked < 4) {
            int index = (int) (Math.random() * 52);
            numberOfCardsPicked++;


            int suitIndex = deckofCards[index] / 13;
            int rankIndex = deckofCards[index] % 13;

            if (!isPickedList[suitIndex]) {
                isPickedList[suitIndex] = true;
                suitsPicked++;
                System.out.println(ranks[rankIndex] + " of " + suits[suitIndex]);
            }
        }

        System.out.println("Number of picks: " + numberOfCardsPicked);
    }


    public static void shuffle(int[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int randomIndex = (int) (Math.random() * deck.length);
            int helper = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = helper;


        }

    }


}
