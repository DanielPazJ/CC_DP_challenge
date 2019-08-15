package product;

import Util.Util;
import product.Item;
import product.Product;

import java.util.Queue;

public class Cookie extends Product {

    public Cookie(String name, String price, String quantity, Queue<Item> items){
        super.name = name;
        super.price = price;
        super.quantity = quantity;
        super.items = items;
        super.addItems(Util.generateItemsList(Integer.valueOf(quantity), super.name, super.price));
    }
}
