package product;

import product.Item;
import product.Product;

import java.util.Queue;

public class Cookie extends Product {

    public Cookie(String name, String price, String quantity, Queue<Item> items){
        super(name,price,quantity,items);
    }
}
