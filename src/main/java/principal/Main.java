package principal;

import builders.BuilderEmployee;
import members.Client;
import members.Employee;
import members.People;
import product.*;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String args[]) {

        List <People> employeesList = new ArrayList<>();
        List<Product> productList = new ArrayList<>();


        FlavorFactory cookieFactory = new CookieFactory();
        FlavorFactory milkFactory = new MilkFactory();
        FlavorFactory icecreamFactory = new IcecreamFactory();

        for(int i=0; i<5; i++){
           employeesList.add(new BuilderEmployee().addName().addPhone().addAddress().addId().build());
        }

        List<People> clientsList = new ArrayList<>();
        clientsList.add(new Client.BuilderClient().addName().addPhone().addAddress().addId().addBudget(13.5).addAge((byte) 23).addItemlist(new ArrayList<>()).build());
        clientsList.add(new Client.BuilderClient().addName().addPhone().addAddress().addId().addBudget(10.8).addAge((byte) 31).addItemlist(new ArrayList<>()).build());
        clientsList.add(new Client.BuilderClient().addName().addPhone().addAddress().addId().addBudget(9.1).addAge((byte) 19).addItemlist(new ArrayList<>()).build());
        clientsList.add(new Client.BuilderClient().addName().addPhone().addAddress().addId().addBudget(27.8).addAge((byte) 25).addItemlist(new ArrayList<>()).build());
        clientsList.add(new Client.BuilderClient().addName().addPhone().addAddress().addId().addBudget(5.0).addAge((byte) 37).addItemlist(new ArrayList<>()).build());
        clientsList.add(new Client.BuilderClient().addName().addPhone().addAddress().addId().addBudget(14.6).addAge((byte) 47).addItemlist(new ArrayList<>()).build());
        clientsList.add(new Client.BuilderClient().addName().addPhone().addAddress().addId().addBudget(11.2).addAge((byte) 81).addItemlist(new ArrayList<>()).build());
        clientsList.add(new Client.BuilderClient().addName().addPhone().addAddress().addId().addBudget(10.1).addAge((byte) 42).addItemlist(new ArrayList<>()).build());
        clientsList.add(new Client.BuilderClient().addName().addPhone().addAddress().addId().addBudget(13.0).addAge((byte) 19).addItemlist(new ArrayList<>()).build());
        clientsList.add(new Client.BuilderClient().addName().addPhone().addAddress().addId().addBudget(43.2).addAge((byte) 33).addItemlist(new ArrayList<>()).build());

        Product vanillaCookie = cookieFactory.createVanillaProduct();
        Product chocolateCookie = cookieFactory.createChocolateProduct();

        productList.add(vanillaCookie);
        productList.add(chocolateCookie);

        Product vanillaMilk = milkFactory.createVanillaProduct();
        Product chocolateMilk = milkFactory.createChocolateProduct();

        productList.add(vanillaMilk);
        productList.add(chocolateMilk);

        Product vanillaIcecream = icecreamFactory.createVanillaProduct();
        Product chocolateIcecream = icecreamFactory.createChocolateProduct();

        productList.add(vanillaIcecream);
        productList.add(chocolateIcecream);

        Store store = new Store(employeesList, "store", productList);

        store.openStore();
        Employee employee = (Employee)store.getEmployees().get(0);
        employee.sell(vanillaCookie, (Client) clientsList.get(0), store);
        employee = (Employee)store.getEmployees().get(1);
        employee.sell(vanillaIcecream, (Client) clientsList.get(2), store);
        employee = (Employee)store.getEmployees().get(3);
        employee.sell(chocolateMilk, (Client) clientsList.get(6), store);
        employee = (Employee)store.getEmployees().get(4);
        employee.sell(chocolateIcecream, (Client) clientsList.get(7), store);
        employee = (Employee)store.getEmployees().get(0);
        employee.sell(vanillaMilk, (Client) clientsList.get(8), store);
        employee = (Employee)store.getEmployees().get(3);
        employee.sell(vanillaCookie, (Client) clientsList.get(5), store);
        employee = (Employee)store.getEmployees().get(2);
        employee.sell(vanillaIcecream, (Client) clientsList.get(4), store);
        employee = (Employee)store.getEmployees().get(4);
        employee.sell(vanillaCookie, (Client) clientsList.get(3), store);
        employee = (Employee)store.getEmployees().get(1);
        employee.sell(chocolateMilk, (Client) clientsList.get(2), store);
        employee = (Employee)store.getEmployees().get(0);
        employee.sell(chocolateCookie, (Client) clientsList.get(1), store);
        employee = (Employee)store.getEmployees().get(4);
        employee.sell(chocolateIcecream, (Client) clientsList.get(9), store);
        employee = (Employee)store.getEmployees().get(2);
        employee.sell(vanillaCookie, (Client) clientsList.get(8), store);
        employee = (Employee)store.getEmployees().get(3);
        employee.sell(chocolateMilk, (Client) clientsList.get(7), store);
        employee = (Employee)store.getEmployees().get(1);
        employee.sell(chocolateIcecream, (Client) clientsList.get(5), store);
        employee = (Employee)store.getEmployees().get(0);
        employee.sell(vanillaMilk, (Client) clientsList.get(2), store);
        employee = (Employee)store.getEmployees().get(2);
        employee.sell(vanillaIcecream, (Client) clientsList.get(4), store);
        employee = (Employee)store.getEmployees().get(4);
        employee.sell(vanillaMilk, (Client) clientsList.get(1), store);
        employee = (Employee)store.getEmployees().get(3);
        employee.sell(vanillaCookie, (Client) clientsList.get(0), store);
        employee = (Employee)store.getEmployees().get(1);
        employee.sell(chocolateMilk, (Client) clientsList.get(8), store);
        employee = (Employee)store.getEmployees().get(2);
        employee.sell(chocolateCookie, (Client) clientsList.get(4), store);
        employee = (Employee)store.getEmployees().get(1);
        employee.sell(chocolateCookie, (Client) clientsList.get(5), store);
        employee = (Employee)store.getEmployees().get(4);
        employee.sell(vanillaIcecream, (Client) clientsList.get(4), store);
        employee = (Employee)store.getEmployees().get(2);
        employee.sell(chocolateMilk, (Client) clientsList.get(2), store);
        employee = (Employee)store.getEmployees().get(0);
        employee.sell(chocolateIcecream, (Client) clientsList.get(1), store);
        employee = (Employee)store.getEmployees().get(1);
        employee.sell(vanillaMilk, (Client) clientsList.get(0), store);
        employee = (Employee)store.getEmployees().get(0);
        employee.sell(vanillaCookie, (Client) clientsList.get(2), store);
        employee = (Employee)store.getEmployees().get(3);
        employee.sell(vanillaIcecream, (Client) clientsList.get(1), store);
        employee = (Employee)store.getEmployees().get(2);
        employee.sell(vanillaCookie, (Client) clientsList.get(3), store);
        employee = (Employee)store.getEmployees().get(4);
        employee.sell(chocolateMilk, (Client) clientsList.get(6), store);
        employee = (Employee)store.getEmployees().get(0);
        employee.sell(chocolateCookie, (Client) clientsList.get(0), store);

        store.closeStore();

        for( int i=0; i < clientsList.size() ; i++ ){
            Client client= (Client) clientsList.get(i);
            client.getBill(store);
        }

    }


}
