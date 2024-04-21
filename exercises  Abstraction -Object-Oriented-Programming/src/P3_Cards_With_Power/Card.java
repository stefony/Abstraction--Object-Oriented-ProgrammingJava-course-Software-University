package P3_Cards_With_Power;

public class Card {

        // започваме да описваме типа цвят на картата, които можем да си вземем от задачата CardSuits

        private CardSuits_1 cardSuit;

        // взимаме ранга на картата
        private ThirteenRanks_1 thirteenRank;

        // другото с което се характевизира картата е силата

        private int power;


        // конструктор

        public Card(CardSuits_1 cardSuit, ThirteenRanks_1 thirteenRank) {
            this.cardSuit = cardSuit;
            this.thirteenRank = thirteenRank;

        }



        public CardSuits_1 getCardSuit() {
            return cardSuit;
        }

        public void setCardSuit(CardSuits_1 cardSuit) {
            this.cardSuit = cardSuit;
        }

        public ThirteenRanks_1 getThirteenRank() {
            return thirteenRank;
        }

        public void setThirteenRank(ThirteenRanks_1 thirteenRank) {
            this.thirteenRank = thirteenRank;
        }

        // трябва да изчисляваме силата
        public int getPower() {
            return this.cardSuit.getSuitPower() + thirteenRank.getPowerRank();
        }

        public void setPower(int power) {
            this.power = power;
        }
    }


