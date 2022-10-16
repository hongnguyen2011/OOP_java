package thecustomerandaccount;

public class Account {
    private int id;
    private Customer customer;
    private double balance;

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString() {
        return customer.toString();
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public Account deposit(double amount) {
        balance += amount;
        return new Account(id, customer, balance);
    }

    public Account withdraw(double amount) {
        if (balance >= amount) balance -= amount;
        else System.out.println("amount withdrawn exceeds the current balance!");
        return new Account(id, customer, balance);
    }
}
