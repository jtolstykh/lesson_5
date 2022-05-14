public class Account
{
    private int id;
    private double balance;

    private Customer customer;

    public Account(int id, double balance, Customer customer) {
        this.id = id;
        //customer.id = id;
        this.balance = balance;
        this.customer = customer;
    }

    public Account(int id, Customer customer) {
        this.id = id;
        //customer.id = id;
        this.customer = customer;
        this.balance = 0.0;
    }


    public double put(double sum){
        balance += sum;
        return balance;
    }

   public double withdraw(double sum){
        if ((balance - sum) >= 0){
            balance -= sum;
        }
       return balance;
   }

   public double deposit(int yearsNum, double percent){
        balance += (balance * percent/100 * yearsNum);
        return balance;
   }

    @Override
    public String toString() {
        return customer.name + "/" + customer.customerType(customer.age) + "/" + customer.id + ": " + balance;
    }
}
