package JavaFundamentals.CafeJava;

public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 5;
        double dripCoffeePrice = 5;
        double lattePrice = 3;
        double cappuccinoPrice = 6;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = true;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = false;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        System.out.println(customer1 + readyMessage);


        if (isReadyOrder2) {
            System.out.println(customer2 + readyMessage);
        } else {
            System.out.println(customer2 + pendingMessage);
        }

        String twoLattes = displayTotalMessage + (lattePrice + lattePrice);

        if (isReadyOrder2) {
            System.out.println(customer2 + readyMessage + ". " + twoLattes);
        } else {
            System.out.println(customer2 + pendingMessage);
        }
        System.out.println(twoLattes);

        System.out.println(customer3 + readyMessage+ " $" + Math.abs(dripCoffeePrice - lattePrice));
    }
}
