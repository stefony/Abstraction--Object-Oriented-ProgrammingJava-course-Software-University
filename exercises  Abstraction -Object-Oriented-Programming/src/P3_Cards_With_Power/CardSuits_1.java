package P3_Cards_With_Power;

public enum CardSuits_1 {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private int suitPower;

    CardSuits_1(int suitPower){
        this.suitPower=suitPower;
    }
    public int getSuitPower(){
        return this.suitPower;
    }
}
