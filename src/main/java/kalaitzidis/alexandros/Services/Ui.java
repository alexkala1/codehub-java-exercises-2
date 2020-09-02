package kalaitzidis.alexandros.Services;

import kalaitzidis.alexandros.Models.Account;
import kalaitzidis.alexandros.Models.StoreAccount;

public class Ui {

    public void run() {
        accountTest();
        storeAccountTest();
    }

    public void accountTest() {
        Account newAccount = new Account("Alex", 500, 0);
        System.out.println("This is testing that our code works in the account class\n\n" + newAccount +
                "\n" +
                "The above is our initial account\n");
        newAccount.withdraw(300);
        System.out.println("Here we made a withdrawal of 300. The program updates us with its proper message and now" +
                "the account looks like this:\n" + newAccount);
        newAccount.deposit(100);
        System.out.println("\n" +
                "and here we made a deposit of 100 with the proper message and now our account is at this state\n"
                + newAccount);
    }

    public void storeAccountTest() {
        StoreAccount newStoreAccount = new StoreAccount("The best store", "PREMIUM");
        System.out.println("\n" +
                "\n" +
                "This is the test for the store account.\n" +
                "\n" +
                "As we see this is the initial store account\n"
                + newStoreAccount);
        System.out.println("\n" +
                "Since this is an account as well we need to initialize the account details as well");

        newStoreAccount.setOwner("Kalaitzidis");
        newStoreAccount.setBalance(300);
        newStoreAccount.setNumberOfTransactions(0);

        System.out.println("And now we can see that the store account owner is " + newStoreAccount.getOwner() + " with "
                + newStoreAccount.getBalance() + " balance and " + newStoreAccount.getNumberOfTransactions() +
                " total transactions.\n" +
                "We will now proceed to change the store account category.");
        newStoreAccount.changeCategory("basic");
        System.out.println("\n" +
                "We have now changed its category and our shop is:\n" + newStoreAccount
                + "\n\n" +
                "And now lets make a withdraw and a deposit like the previous account.\n");
        newStoreAccount.withdraw(100);
        System.out.println("The new balance is " + newStoreAccount.getBalance() + " and the updated number of transactions is"
                + newStoreAccount.getNumberOfTransactions() + "\n");
        newStoreAccount.deposit(600);
        System.out.println("The new balance is " + newStoreAccount.getBalance() + " and the updated number of transactions is"
                + newStoreAccount.getNumberOfTransactions());
    }
}
