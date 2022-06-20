package takeaway.challenge;

import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Order {
    ArrayList<Dish> Order = new ArrayList<>();

    public void AddToOrder(Dish Dish) {
        Order.add(Dish);
    }

    public ArrayList<Dish> ViewOrder() {
        return Order;
    }

    public boolean CheckPrice(Double ExpectedPrice) {
        Double ActualPrice = 0.00;
        for (Dish Dish : Order) {
            ActualPrice += Dish.getPrice();
        }
        Double ActualPriceRounded = Math.round(ActualPrice * 100.0) / 100.0;
        if (ActualPriceRounded.equals(ExpectedPrice)) {
            return true;
        } else {
            return false;
        }
    }

    public String PlaceOrder() {
        LocalDateTime toFormat = LocalDateTime.now().plusHours(1);
        DateTimeFormatter formated = DateTimeFormatter.ofPattern("HH:mm");

        String InAnHour = toFormat.format(formated);

        String message = String.format("Thank you! Your order was placed and will be delivered before %s", InAnHour);
        return message;
    }
}