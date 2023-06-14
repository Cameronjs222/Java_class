import java.lang.reflect.Array;
import java.util.ArrayList;

public class CafeOrder {

    // instance variables
    public String name;
    public double total;
    public boolean ready;
    private ArrayList<CafeItem> items;

    // constructor

    public CafeOrder(double total, boolean ready) {
        this.name = "Customer";
        this.items = new ArrayList<CafeItem>();
    }

    //overloaded constructor
    public CafeOrder(String name) {
        this.name = name;
        this.items = new ArrayList<CafeItem>();
    }

    // methods
    
    public double getTotal() {
        return total;
    }
    
    public void addItem(CafeItem item) {
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
        double total = 0;
        for(CafeItem item : items){
            total += item.getPrice();
        }
        return total;
    }
    
    public void display() {
        System.out.println("Order for " + name);
        for(CafeItem item : items){
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
        System.out.println("Total: $" + getOrderTotal());
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
    
    public ArrayList<CafeItem> getItems() {
        return this.items;
    }

    public void setItems(ArrayList<CafeItem> items) {
        this.items = items;
    }
}
