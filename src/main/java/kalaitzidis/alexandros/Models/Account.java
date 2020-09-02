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

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getNumberOfTransactions() {
        return numberOfTransactions;
    }

    public void setNumberOfTransactions(int numberOfTransactions) {
        this.numberOfTransactions = numberOfTransactions;
    }

    public void withdraw(double amount) {
        if (balance > amount)
            balance -= amount;
        numberOfTransactions++;
        System.out.println("You have made a withdrawal of " + amount + " and now your updated balance is " + balance);
    }

    public void deposit(double amount) {
        balance += amount;
        numberOfTransactions++;
        System.out.println("You have made a deposit of " + amount + " and now your updated balance is " + balance);
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
