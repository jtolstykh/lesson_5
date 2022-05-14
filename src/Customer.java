public class Customer {

    public int id;
    public String name;
    public int age;

    public Customer() {
    }

    public Customer(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String customerType(int age){
        if (age < 14){
            return "deny";
        } else if (age < 21) {
            return  "teen";
        } else if (age < 65) {
            return "regular";
        } else {
           return "retiree";
        }
    }

    @Override
    public String toString() {
        return name + "/" + customerType(age) + "/" + id;
    }


}
