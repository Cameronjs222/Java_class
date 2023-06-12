import java.util.ArrayList;

public class CafeTest {
        public static void main(String[] args) {
        CafeLogic testCafe = new CafeLogic();
        int streak = 5;
        int total = testCafe.getStreakGoal(streak);
        System.out.println("Total: " + total);
        double[] prices = { 3.5, 1.5, 4.0, 4.5 };
        double orderTotal = testCafe.getOrderPrices(prices);
        System.out.println("Order total: " + orderTotal);
        ArrayList<String> menuItems = new ArrayList<String>();
        menuItems.add("Coffee");
        menuItems.add("Tea");
        menuItems.add("Scone");
        menuItems.add("Brownie");
        testCafe.displayMenu(menuItems);
        ArrayList<String> customerList = new ArrayList<String>();
        testCafe.addCustomer(customerList);
    }
}
