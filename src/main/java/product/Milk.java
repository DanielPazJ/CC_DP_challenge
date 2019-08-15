package product;

import product.Item;
import product.Product;

import java.util.Queue;

public class Milk extends Product {
    public Milk(String name, String price, String quantity, Queue<Item> items){
        super(name,price,quantity,items);
    }
}
