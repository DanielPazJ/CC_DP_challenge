public class PeopleFactory {

    public Employees createEmployee(){
        Employees person=new Employees();
        return person;
    }
    public  Client createClient(double budget, byte age){
        Client person=new Client(budget,age);
        return person;
    }

}
