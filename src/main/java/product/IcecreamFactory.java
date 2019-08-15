package product;

import java.util.LinkedList;

public class IcecreamFactory extends FlavorFactory {

    @Override
    public Product createVanillaProduct(){
        return new Icecream("Vainilla Icecream", "3.0","15", new LinkedList<Item>());
    }
    @Override
    public Product createChocolateProduct(){
        return new Icecream("Chocolote Icecream", "3.5","15", new LinkedList<Item>());
    }
}