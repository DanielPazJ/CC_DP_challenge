package members;

 import com.github.javafaker.Faker;
 import product.Item;
 import product.Store;
 import java.util.ArrayList;

public class Client extends People {

    public double budget;
    public byte age;
    public ArrayList<Item> itemsPurchased;


        public static class BuilderClient{
            private  Faker faker = new Faker();
            public String name;
            public String id;
            public String address;
            public String phone;
            public double budget;
            public byte age;
            public ArrayList<Item> itemsPurchased;



            public BuilderClient addId () {
                this.id = faker.number().digits(9);
                return this;
            }

            public BuilderClient addName () {
                this.name = (faker.harryPotter().character());
            return this;
            }

            public BuilderClient addAddress () {
                this.address = (faker.address().fullAddress());
            return this;
            }

            public BuilderClient addPhone () {
                this.phone = (faker.phoneNumber().cellPhone());
            return this;
            }

            public BuilderClient addBudget ( double budget){
                this.budget = budget;
            return this;
            }

            public BuilderClient addAge ( byte age){
                this.age = age;
            return this;
             }

            public BuilderClient addItemlist (ArrayList < Item > itemsPurchased) {
                this.itemsPurchased = itemsPurchased;
            return this;
            }

            public Client build () {

                Client client = new Client();
                client.id = this.id;
                client.name = this.name;
                client.address = this.address;
                client.phone = this.phone;
                client.budget = this.budget;
                client.age = this.age;
                client.itemsPurchased = this.itemsPurchased;
                return client;

                }
         }

    public void getBill(Store store){
        if (!itemsPurchased.isEmpty()){
            System.out.println("\tBill "+ super.getName());
            for (int i = 0 ; i < this.itemsPurchased.size() ; i++){
                System.out.print(this.itemsPurchased.get(i));
            }
        }
    }

}
