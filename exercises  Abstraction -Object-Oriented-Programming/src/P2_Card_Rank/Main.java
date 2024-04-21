package P2_Card_Rank;

public class Main {
    public static void main(String[] args) {

        System.out.println("Card Ranks:");

        ThirteenRanks[] thirteenRanks = ThirteenRanks.values();

        for (ThirteenRanks thirteenRank : thirteenRanks ) {
            System.out.printf("Ordinal value: %d; Name value: %s%n",thirteenRank.ordinal(),thirteenRank.toString());
        }

    }
}
