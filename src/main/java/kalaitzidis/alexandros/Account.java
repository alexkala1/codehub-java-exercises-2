package kalaitzidis.alexandros;

public class Account {
    private String owner;
    private double balance;
    private int numberOfTransactions = 0;

    public Account() {
    }

    public Account(String owner, double balance, int numberOfTransactions) {
        this.owner = owner;
        this.balance = balance;
        this.numberOfTransactions = numberOfTransactions;
    }

    public void withdraw(double amount) {
        if (balance > amount)
            balance -= amount;
        numberOfTransactions++;
    }

    public void deposit(double amount) {
        balance += amount;
        numberOfTransactions++;
    }
}
