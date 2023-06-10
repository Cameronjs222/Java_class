package CafeBusinessLogic;

import java.util.ArrayList;

public class CafeLogic {
    public int getStreakGoal(int streak) {
        int total = 0;

        for (int i = 1; i <= streak; i++) {
            total += i;
        }
        return total;
    } 
    double getOrderPrices(double[] prices) {
        double total = 0;
        for (double price : prices) {
            total += price;
        }
        return total;
    }
    void displayMenu(ArrayList<String> menuItems) {
        for (String item : menuItems) {
            int index = menuItems.indexOf(item);
            System.out.println(index + " " + item);
        }
    }


    public void addCustomer(ArrayList<String> customerList) {
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println("There are " + customerList.size() + " people ahead of you.\n");
        customerList.add(userName);
        System.out.println(customerList);
    }

}