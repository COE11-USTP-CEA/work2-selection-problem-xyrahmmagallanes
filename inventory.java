import java.util.List;
import java.util.ArrayList;

public class inventory{
    public static void main (String[]args){
        item t1 = new item("palmolive","shampoo", 5.00f);
        item t2 = new item("safegaurd","soap", 16.00f);
        item t3 = new item("max","candy", 1.00f);
        item t4 = new item("lucky me","Noodles", 12.00f);
        item t5 = new item("commando","match", 2.00f);
        
        List<item> inv = new ArrayList<item>();
        inv.add(t1);
        inv.add(t2);
        inv.add(t3);
        inv.add(t4);
        inv.add(t5);
        
        for(item x: inv){
            System.out.println("Item Name: " + x.getname());
            System.out.println("Item Type: " + x.getcategory());
            System.out.println("Price: " + x.getprice());
        }
    }
}
 