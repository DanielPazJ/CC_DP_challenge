package builders;

import com.github.javafaker.Faker;
import members.Employee;

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
        return this.employee;
    }
}
