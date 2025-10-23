public class Listing07_02_DeckOfCards {
    public static void main(String[] args) {
        int[] deck = new int[52];

        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }

        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        for (int i = 0; i < deck.length; i++) {
            int j = (int) (Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }

        for (int i = 0; i < 4; i++) {
            System.out.println("Card number " + deck[i] + ": " + ranks[deck[i] % 13] + " of " + suits[deck[i] / 13]);
        }

    }
}
