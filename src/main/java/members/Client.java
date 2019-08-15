package members;

public class Client extends People {

    public double budget;
    public byte age;

    public Client(double budget, byte age) {
        this.budget = budget;
        this.age = age;
        }
        public String getId () {
            return id;
        }
        public void setId (String id){
            this.id = id;
        }
        public String getName () {
            return name;
        }
        public void setName (String name){
            this.name = name;
        }
        public String getAddress () {
            return address;
        }
        public void setAddress (String address){
            this.address = address;
        }
        public String getPhone () {
            return phone;
        }
        public void setPhone (String phone){
            this.phone = phone;
        }
        public void buy () {
        }

}
