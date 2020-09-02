package kalaitzidis.alexandros.Models;

public class StoreAccount extends Account {
    private String storeName;
    private String accountCategory;
    private Categories categories;


    public StoreAccount(String storeName, String accountCategory) {
        this.storeName = storeName;
        this.accountCategory = accountCategory;
    }

    public void changeCategory(String Category) {
        for (Categories category : categories.values()) {
            if (Category.equalsIgnoreCase(category.toString())) {
                this.accountCategory = category.toString();
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "StoreAccount{" +
                "storeName='" + storeName + '\'' +
                ", accountCategory='" + accountCategory + '\'' +
                '}';
    }
}
