package members;
import product.Store;
import product.Product;

public class Employee extends People {

    public Employee(){

    }
    public String getId(){
        return id;
    }

    public void setId (String id){
        this.id=id;
    }
    public String getName(){
        return name;
    }

    public void setName (String name){
        this.name=name;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress (String address){
        this.address=address;
    }
    public String getPhone(){
        return phone;
    }

    public void sell(Product product, Client client, Store store){
        double price = 0;
        for (int i=0; i< store.getProductList().size(); i++){
            if(product.equals(store.getProductList().get(i))){
                price = store.getProductList().get(i).getPrice();
                client.budget = client.budget - price;
                client.itemsPurchased.add(store.getProductList().get(i).removeItem());
            }
        }
        if (price==0){
            System.out.println("That product isn't exists on this store");
        }
    }

}
