package builders;

import com.github.javafaker.Faker;
import members.Employee;

//    static Faker faker = new Faker();
//    public String name;
//    public String id=faker.number().digits(9);
//    public String address=faker.address().fullAddress();
//    public String phone=faker.phoneNumber().cellPhone();

public class BuilderEmployee {

    Employee employee;
    Faker faker;

    public BuilderEmployee(){
        this.employee= new Employee();
        this.faker= new Faker();
    }

    public BuilderEmployee addId(){
        employee.setId(faker.number().digits(9));
        return this;
    }

    public BuilderEmployee addName(){
        employee.setName(faker.harryPotter().character());
        return this;
    }

    public BuilderEmployee addAddress(){
        employee.setAddress(faker.address().fullAddress());
        return this;
    }

    public BuilderEmployee addPhone(){
        employee.setPhone(faker.phoneNumber().cellPhone());
        return this;
    }

    public Employee build(){
        System.out.print(this.employee.getAddress());
        return this.employee;
    }
}
