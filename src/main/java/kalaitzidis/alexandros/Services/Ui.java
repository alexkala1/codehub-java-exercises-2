package kalaitzidis.alexandros.Services;

import kalaitzidis.alexandros.Models.Account;
import kalaitzidis.alexandros.Models.StoreAccount;

public class Ui {

    public void run() {
        /* Tester method for account */
        Account newAccount = new Account("Alex", 500, 0);
        newAccount.withdraw(300);
        newAccount.deposit(100);
        System.out.println(newAccount);

        /* Tester method for storeAccount */
        StoreAccount newStoreAccount = new StoreAccount("The best store", "PREMIUM");
        System.out.println("This is the initial store\n" + newStoreAccount);
        newStoreAccount.changeCategory("basic");
        System.out.println("\nAnd this is the same store with its category changed\n" + newStoreAccount);
    }
}
