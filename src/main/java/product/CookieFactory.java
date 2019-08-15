package product;

import java.util.LinkedList;

public class CookieFactory extends FlavorFactory {

    @Override
    public Product createVanillaProduct(){
        return new Cookie("Vainilla Cookie", "2.0","24", new LinkedList<Item>());
    }
    @Override
    public Product createChocolateProduct(){
        return new Cookie("Chocolote Cookie", "2.0","17", new LinkedList<Item>());
    }
    @Override
    public Product createCoconutProduct(){
        return new Cookie("Coconut Cookie", "1.5","15", new LinkedList<Item>());
    }
}
