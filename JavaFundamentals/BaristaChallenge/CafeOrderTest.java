import java.util.ArrayList;

public class CafeOrderTest {
public static void main(String[] args){
    CafeItem item1 = new CafeItem("coffee" , 3.5); 
    CafeItem item2 = new CafeItem("latte" , 1.5);
    CafeItem item3 = new CafeItem("drip coffee" , 4.0);
    CafeItem item4 = new CafeItem("capuccino" , 4.5);
    CafeOrder order1 = new CafeOrder("Cindhuri");
    order1.addItem(item1);
    order1.addItem(item4);
    order1.total = item1.getPrice() + item4.getPrice();
    order1.ready = true;
    CafeOrder order2 = new CafeOrder("Jimmy");
    order2.addItem(item2);
    order2.addItem(item2);
    order2.addItem(item3);
    order2.total = item2.getPrice() + item2.getPrice() + item3.getPrice();
    order2.ready = true;
    CafeOrder order3 = new CafeOrder("Noah");
    order3.addItem(item4);
    order3.total = item4.getPrice();
    order3.ready = true;
    CafeOrder order4 = new CafeOrder("Sam");
    order4.addItem(item2);
    order4.addItem(item2);
    order4.total = item2.getPrice() + item2.getPrice();
    order4.ready = false;

    order1.display();
    order2.display();
    order3.display();
    order4.display();
}    
}
