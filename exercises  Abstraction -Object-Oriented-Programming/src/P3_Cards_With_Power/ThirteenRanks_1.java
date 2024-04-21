package P3_Cards_With_Power;

public enum ThirteenRanks_1 {
    ACE(14),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(11),
    QUEEN(12),
    KING(13);

    // всеки един запис по горе от се характеризира с име и powerRank
    private int powerRank;

    // правим конструктор и му казваме, че числото по горе в скобите искаме да го запишем в скобите на ThirteenRanks (int powerRank)
    ThirteenRanks_1(int powerRank){
        // този power по горе става равен на powerRank в скобите
        this.powerRank=powerRank;
    }
    // за да взема на тези записи колко е негота стойност (ACE(14),) трябва да си направя Getter
    public int getPowerRank(){
        return this.powerRank; // искам да ми върне характеристиката на powerRank
    }
}
