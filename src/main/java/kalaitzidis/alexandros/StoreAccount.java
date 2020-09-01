package kalaitzidis.alexandros;

public class StoreAccount extends Account {
    private String storeName;
    private String accountCategory;
    private Categories categories;

    public StoreAccount() {
    }

    public StoreAccount(String storeName, String accountCategory) {
        this.storeName = storeName;
        this.accountCategory = accountCategory;
    }

    public void changeCategory(StoreAccount store, String Category) {
        for (Categories category : categories.values()) {
            if (category.toString().equals(Category)) {
                store.accountCategory = Category;
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "StoreAccount{" +
                "storeName='" + storeName + '\'' +
                ", accountCategory='" + accountCategory + '\'' +
                ", categories=" + categories +
                '}';
    }
}
