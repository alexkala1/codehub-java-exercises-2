package kalaitzidis.alexandros.Models;

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
        System.out.println("You withdrew " + amount + " and now your updated balance is " + balance);
    }

    public void deposit(double amount) {
        balance += amount;
        numberOfTransactions++;
        System.out.println("You deposited " + amount + " and now your updated balance is " + balance);
    }

    @Override
    public String toString() {
        return "Account{" +
                "owner='" + owner + '\'' +
                ", balance=" + balance +
                ", numberOfTransactions=" + numberOfTransactions +
                '}';
    }
}
