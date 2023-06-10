package CafeBusinessLogic;
import java.util.ArrayList;
public class CafeTest {
    public static void main(String[] args) {
        CafeLogic cafeLogic = new CafeLogic();
        int streak = 5;
        int total = cafeLogic.getStreakGoal(streak);
        System.out.println("Total: " + total);
        double[] prices = { 3.5, 1.5, 4.0, 4.5 };
        double orderTotal = cafeLogic.getOrderPrices(prices);
        System.out.println("Order total: " + orderTotal);
        ArrayList<String> menuItems = new ArrayList<String>();
        menuItems.add("Coffee");
        menuItems.add("Tea");
        menuItems.add("Scone");
        menuItems.add("Brownie");
        cafeLogic.displayMenu(menuItems);
        ArrayList<String> customerList = new ArrayList<String>();
        cafeLogic.addCustomer(customerList);
    }
}
