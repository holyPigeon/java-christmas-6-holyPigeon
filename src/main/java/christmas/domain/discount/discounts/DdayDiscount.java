package christmas.domain.discount.discounts;

import christmas.domain.discount.Discount;
import christmas.domain.order.menu.Menu;
import christmas.domain.order.Day;
import christmas.domain.order.menu.Quantity;

import java.util.Map;

public class DdayDiscount implements Discount {
    @Override
    public int calculateDiscountAmount(Map<Menu, Quantity> customerMenus, Day day) {
        if (isAvailableDiscount(customerMenus, day)) {
            return 1000 + 100 * (day.getPrimitiveDay() - 1);
        }
        return 0;
    }

    @Override
    public boolean isAvailableDiscount(Map<Menu, Quantity> customerMenus, Day day) {
        return day.getPrimitiveDay() >= 1 && day.getPrimitiveDay() <= 25;
    }
}