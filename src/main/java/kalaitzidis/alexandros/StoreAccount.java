package kalaitzidis.alexandros;

public class StoreAccount extends Account {
    private String storeName;
    private String accountCategory;

    public StoreAccount() {
    }

    public StoreAccount(String storeName, String accountCategory) {
        this.storeName = storeName;
        this.accountCategory = accountCategory;
    }

    public void changeCategory(String Category) {

    }
}
