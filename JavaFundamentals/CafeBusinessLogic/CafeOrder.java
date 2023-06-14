import java.lang.reflect.Array;
import java.util.ArrayList;

public class CafeOrder {
    public String name;
    public double total;
    public boolean ready;
    public ArrayList<String> items = new ArrayList<String>();

    public CafeOrder(String name, double total, boolean ready, ArrayList<String> items) {
        this.name = name;
        this.total = total;
        this.ready = ready;
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public double getTotal() {
        return total;
    }

    public boolean isReady() {
        return ready;
    }

    public ArrayList<String> getItems() {
        return items;
    }
    
}
