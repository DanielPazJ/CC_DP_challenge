package product;

import java.util.LinkedList;

public  class MilkFactory extends FlavorFactory{

    @Override
    public Product createVanillaProduct() {

        return new Milk("Vanilla Milk", "3.6", "22", new LinkedList<Item>());
    }

    @Override
    public Product createChocolateProduct() {

        return new Milk("Chocolate Milk",  "3.1", "54", new LinkedList<Item>());
    }


}
