package product;

import members.Client;
import product.Product;
import members.People;
import java.time.Period;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Store {

    private List<People> employees;
    private String name;
    private List<Product> productList;
    private static Store store;

    public Store(List<People> employees,  String name, List<Product> productList) {
        this.employees = employees;
        this.name= name;
        this.productList = productList;
    }

    public void openStore(){
        System.out.println("product.Store is open");
    }
    public void closeStore(){
        System.out.println("Closing store");

    }

    public List<Product> getProductList(){
        return this.productList;
    }

    public List<People> getEmployees(){
        return this.employees;
    }
}

