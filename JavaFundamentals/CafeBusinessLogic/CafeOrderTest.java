import java.util.ArrayList;

public class CafeOrderTest {
public static void main(String[] args){
    CafeItem item1 = new CafeItem("coffee" , 3.5); 
    CafeItem item2 = new CafeItem("latte" , 1.5);
    CafeItem item3 = new CafeItem("drip coffee" , 4.0);
    CafeItem item4 = new CafeItem("capuccino" , 4.5);
    CafeOrder order1 = new CafeOrder("Cindhuri", 0, false, new ArrayList<String>());
    order1.name = "Cindhuri";
    order1.items = new ArrayList<String>();
    order1.addItem(item1.getName());
    order1.addItem(item4.getName());
    order1.total = item1.getPrice() + item4.getPrice();
    order1.ready = true;
    CafeOrder order2 = new CafeOrder("Jimmy", 0, false, new ArrayList<String>());
    order2.addItem(item2.getName());
    order2.addItem(item2.getName());
    order2.addItem(item3.getName());
    order2.total = item2.getPrice() + item2.getPrice() + item3.getPrice();
    order2.ready = true;
    CafeOrder order3 = new CafeOrder("Noah", 0, false, new ArrayList<String>());
    order3.addItem(item4.getName());
    order3.total = item4.getPrice();
    order3.ready = true;
    CafeOrder order4 = new CafeOrder("Sam", 0, false, new ArrayList<String>());
    order4.addItem(item2.getName());
    order4.addItem(item2.getName());
    order4.total = item2.getPrice() + item2.getPrice();
    order4.ready = false;

    System.out.println("Order 1: " + order1.name + " " + order1.total + " " + order1.ready);
    System.out.println("Order 2: " + order2.name + " " + order2.total + " " + order2.ready);
    System.out.println("Order 3: " + order3.name + " " + order3.total + " " + order3.ready);
    System.out.println("Order 4: " + order4.name + " " + order4.total + " " + order4.ready);

}    
}
