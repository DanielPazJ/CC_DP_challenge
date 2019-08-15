package Util;

import com.github.javafaker.Faker;
import product.Item;
import java.util.LinkedList;
import java.util.List;

public class Util {

    static Faker faker = new Faker();

    public static List<Item> generateItemsList(int size, String name, String price){
        List<Item> items = new LinkedList<Item>();
        for (int i=0;i<size;i++){
            Item item = new Item(faker.number().numberBetween(0,1000000), name, price);
            while (isItemInList(item, items)){
                item = new Item(faker.number().numberBetween(0,1000000), name, price); }
            items.add(item);
        }
        return items;
    }

    public static boolean isItemInList(Item expectedItem, List<Item> lista){
        for(Item item: lista){
            if (expectedItem.id==item.id){
                return true;
            }
        }
        return false;
    }
}
