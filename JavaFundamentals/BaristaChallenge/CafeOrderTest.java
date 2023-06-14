import java.util.ArrayList;

public class CafeOrderTest {
public static void main(String[] args){

    CafeItem item1 = new CafeItem("coffee" , 3.5); 
    CafeItem item2 = new CafeItem("latte" , 1.5);
    CafeItem item3 = new CafeItem("drip coffee" , 4.0);
    CafeItem item4 = new CafeItem("capuccino" , 4.5);


    // create 2 unspecific orders
    CafeOrder order1 = new CafeOrder(3.5, false);
    CafeOrder order2 = new CafeOrder(1.5, false);

    // Create 3 orders using the overloaded constructor to give each a name for the order.
    CafeOrder order3 = new CafeOrder("John");
    CafeOrder order4 = new CafeOrder("Jane");
    CafeOrder order5 = new CafeOrder("Joe");

    //Add at least 2 items to each of the orders using the addItem method you wrote, for example, to add item1 to order3 you would need to call the addItem method from the order3 instance like so: order3.addItem(item1);
    order1.addItem(item1);
    order1.addItem(item2);
    order2.addItem(item3);
    order2.addItem(item4);
    order3.addItem(item1);
    order3.addItem(item2);
    order4.addItem(item3);
    order4.addItem(item4);
    order5.addItem(item1);
    order5.addItem(item4);

    //Test the results and the display method by calling the display method on all of your orders, like so: order3.display();
    order1.ready = true;
    order2.ready = true;

    order1.display();
    order2.display();
    order3.display();
    order4.display();
    order5.display();

}
}