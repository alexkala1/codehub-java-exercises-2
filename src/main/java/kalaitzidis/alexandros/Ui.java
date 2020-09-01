package kalaitzidis.alexandros;

public class Ui {
    StoreAccount storeAccount = new StoreAccount();
    public void run() {
        StoreAccount store1 = new StoreAccount("tokalopaidi", "PREMIUM");
        System.out.println(store1);
        storeAccount.changeCategory(store1, "BASIC");
        storeAccount.deposit(500);
        System.out.println(store1);
    }
}
