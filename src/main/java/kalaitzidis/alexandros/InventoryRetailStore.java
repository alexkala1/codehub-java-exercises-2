package kalaitzidis.alexandros;

import java.util.ArrayList;
import java.util.List;

public class InventoryRetailStore implements IStore {
    private List<Product> productList = new ArrayList<>();

    public InventoryRetailStore() {
    }

    public void reset() {
    }

    @Override
    public void buy(Product product) {
        productList.add(product);
    }

    @Override
    public void sell(Product product) {
        productList.remove(product);
    }

    @Override
    public double getRevenue() {
        return 0;
    }

    public void getInventory() {
        productList.forEach(product -> System.out.println(product));
    }

}
