package P3_Cards_With_Power;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);// четем двата реда на входните данни  - ранг и цвят

        String rang = scanner.nextLine();
        String suit = scanner.nextLine();

        // след като имаме ранга и цвета си създавм карта

        Card card = new Card(CardSuits_1.valueOf(suit),ThirteenRanks_1.valueOf(rang));  // в скобите на new Card() трябва да подам ОТ ENUM CardSuits стйнотстта  и от rang

        System.out.printf("Card name: %s of %s; Card power: %d ",card.getThirteenRank(),card.getCardSuit(),card.getPower());
    }
}
