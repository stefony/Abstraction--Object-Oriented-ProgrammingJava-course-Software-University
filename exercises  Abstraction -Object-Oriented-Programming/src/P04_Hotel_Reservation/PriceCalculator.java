package P04_Hotel_Reservation;

public class PriceCalculator {
       public static double calculatesPrice (double pricePerDay, int numberOfDays, Season season, DiscountType discountType) {
        // намираме сумата за всички дни
        double price = pricePerDay * numberOfDays;
        // умножение спрямо сезона
        price=price * season.getCoefficient();

        //правим остъпката
        price=price - price * discountType.getPercent()/100;

        return price;
    }

}
