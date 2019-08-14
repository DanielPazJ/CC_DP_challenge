package Members;

import com.github.javafaker.Faker;

public abstract class People {
    static Faker faker = new Faker();
    public String name=faker.harryPotter().character();
    public String id=faker.number().digits(9);
    public String address=faker.address().fullAddress();
    public String phone=faker.phoneNumber().cellPhone();

}

