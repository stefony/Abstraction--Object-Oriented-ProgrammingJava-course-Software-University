package P1_Card_Suit;

public class Main {
    public static void main(String[] args) {

        System.out.println("Card Suits:");
        CardSuits[] cardSuit = CardSuits.values();

        for (CardSuits cardSuits:cardSuit) {
            System.out.printf("Ordinal value: %d; Name value: %s%n",cardSuits.ordinal(),cardSuits.toString());
        }
    }
}
