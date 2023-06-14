import java.lang.reflect.Array;
import java.util.ArrayList;

public class CafeOrder {

    // instance variables
    public String name;
    public double total;
    public boolean ready;
    public ArrayList<String> items = new ArrayList<String>();

    // constructor

    public CafeOrder(double total, boolean ready) {
        this.name = "Customer";
        this.total = total;
        this.ready = ready;
        this.items = new ArrayList<String>();
    }

    // methods
    
    public double getTotal() {
        return total;
    }
    
    public void addItem(String item) {
        items.add(item);
    }
    
    public String getStatusMessage () {
        if (ready) {
            return "Ready for pickup";
        } else {
            return "Waiting for pickup";
        }
    }
    
    public double getOrderTotal() {
        return total;
    }
    
    public String display() {
        return "Order: " + name + " " + items + " " + total + " " + ready;
    }
    
    // getters and setters
    public String getName() {
        return name;
    }
    
    public void setName(String newName) {
        this.name = newName;
    }
    
    public boolean getReady() {
        return ready;
    }
    
    public void setReady(boolean newReady) {
        this.ready = newReady;
    }
    
    public ArrayList<String> getItems() {
        return items;
    }

    public void setItems(ArrayList<String> newItems) {
        this.items = newItems;
    }
}
