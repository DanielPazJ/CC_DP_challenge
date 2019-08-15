package builders;

import com.github.javafaker.Faker;
import members.Client;
import members.Employee;

public class BuilderClient {
    Client client;
    Faker faker;
    double budget;
    byte age;

    public BuilderClient(double budget, byte age){
        this.client= new Client(budget, age);
        this.faker= new Faker();
        this.budget = budget;
        this.age = age;
    }

    public BuilderClient addId(){
        client.setId(faker.number().digits(9));
        return this;
    }

    public BuilderClient addName(){
        client.setName(faker.harryPotter().character());
        return this;
    }

    public BuilderClient addAddress(){
        client.setAddress(faker.address().fullAddress());
        return this;
    }

    public BuilderClient addPhone(){
        client.setPhone(faker.phoneNumber().cellPhone());
        return this;
    }

    public BuilderClient addBudget(){
        client.budget=this.budget;
        return this;
    }

    public BuilderClient addAge(){
        client.age=this.age;
        return this;
    }

    public Client build(){
        return this.client;
    }
}
