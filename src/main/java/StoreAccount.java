import jdk.jfr.Category;

public class StoreAccount extends Account {
    private String storeName;
    private String accountCategory;

    public StoreAccount() {

    }

    public StoreAccount(String storeName, String accountCategory) {
        this.storeName = storeName;
        this.accountCategory = accountCategory;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getAccountCategory() {
        return accountCategory;
    }

    public void setAccountCategory(String accountCategory) {
        this.accountCategory = accountCategory;
    }

    public void withdraw(double amount) {

    }

    public void deposit(double amount) {

    }

    public void changeCategory(String Category) {

    }
}
