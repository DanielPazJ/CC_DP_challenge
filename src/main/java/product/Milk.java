package product;

import Util.Util;

import java.util.Queue;

public class Milk extends Product {
    public Milk(String name, String price, String quantity, Queue<Item> items){
        super.name = name;
        super.price = price;
        super.quantity = quantity;
        super.items = items;
        super.addItems(Util.generateItemsList(Integer.valueOf(quantity), super.name, super.price));
    }
}
