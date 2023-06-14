import java.util.ArrayList;

public class CafeOrderTest {
public static void main(String[] args){
    CafeItem item1 = new CafeItem();
    item1.name = "Coffee";
    item1.price = 3.5;
    CafeItem item2 = new CafeItem();
    item2.name = "latte";
    item2.price = 1.5;
    CafeItem item3 = new CafeItem();
    item3.name = "drip coffee";
    item3.price = 4.0;
    CafeItem item4 = new CafeItem();
    item4.name = "capuccino";
    item4.price = 4.5;
    CafeOrder order1 = new CafeOrder();
    order1.name = "Cindhuri";
    order1.items = new ArrayList<String>();
    order1.items.add(item1.name);
    order1.items.add(item4.name);
    order1.total = item1.price + item4.price;
    order1.ready = true;
    CafeOrder order2 = new CafeOrder();
    order2.name = "Jimmy";
    order2.items = new ArrayList<String>();
    order2.items.add(item2.name);
    order2.total = item1.price;
    order2.ready = true;
    CafeOrder order3 = new CafeOrder();
    order3.name = "Noah";
    order3.items = new ArrayList<String>();
    order3.items.add(item4.name);
    order3.total = item4.price;
    order3.ready = true;
    CafeOrder order4 = new CafeOrder();
    order4.name = "Sam";
    order4.items = new ArrayList<String>();
    order4.items.add(item2.name);
    order4.items.add(item2.name);
    order4.total = item2.price + item2.price;
    order4.ready = false;

    System.out.println("Order 1: " + order1.name + " " + order1.total + " " + order1.ready);
    System.out.println("Order 2: " + order2.name + " " + order2.total + " " + order2.ready);
    System.out.println("Order 3: " + order3.name + " " + order3.total + " " + order3.ready);
    System.out.println("Order 4: " + order4.name + " " + order4.total + " " + order4.ready);

}    
}
