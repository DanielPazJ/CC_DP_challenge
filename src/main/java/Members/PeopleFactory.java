package Members;

import Members.Client;
import Members.Employee;
import Members.People;

public class PeopleFactory {

    public People newPerson(boolean type, double budget, byte age){
        return new Client(budget,age);
    }

    public People newPerson(boolean type){
            return new Employee();
    }
}
