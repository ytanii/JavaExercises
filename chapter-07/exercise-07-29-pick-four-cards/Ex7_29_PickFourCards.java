import java.util.Scanner;

public class Ex7_29_PickFourCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] deckOfCards = new int[52];

        for (int i = 0; i < deckOfCards.length; i++) {
            deckOfCards[i] = i;
        }

        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};


        int sum = 0;
        int count = 0;
        String[] lastFourCards = new String[4];

        while (sum != 24) {
            sum = 0;
            shuffle(deckOfCards);
            for (int i = 0; i < 4; i++) {
                int rankIndex = deckOfCards[i] % 13;
                int suitIndex = deckOfCards[i] / 13;
                sum += rankIndex + 1;
                lastFourCards[i] = ranks[rankIndex] + " of " + suits[suitIndex];
            }
            count++;
        }

        for (String card : lastFourCards) {
            System.out.println(card);
        }
        System.out.println("The number of picks it took to get a sum of 24 was " + count);


    }

    public static void shuffle(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int randomIndex = (int) (Math.random() * 52);
            int helper = list[i];
            list[i] = list[randomIndex];
            list[randomIndex] = helper;
        }
    }
}
