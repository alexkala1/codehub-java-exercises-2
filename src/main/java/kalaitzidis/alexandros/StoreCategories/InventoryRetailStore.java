package kalaitzidis.alexandros.StoreCategories;

import kalaitzidis.alexandros.Models.Product;
import kalaitzidis.alexandros.Models.Store;

import java.util.ArrayList;
import java.util.List;

public class InventoryRetailStore extends Store {
    private double totalBuyBalance;
    private double totalSellBalance;
    private List<Product> productList = new ArrayList<>();

    public InventoryRetailStore() {
    }

    public void reset() {
        productList.clear();
    }

    @Override
    public void buy(Product product) {
        totalBuyBalance += product.getPriceWhenBuy();
        productList.add(product);
    }

    @Override
    public void sell(Product product) {
        totalSellBalance += product.getPriceWhenSell();
        productList.remove(product);
    }


    public double getRevenue() {
        return totalSellBalance - totalBuyBalance;
    }

    public void getInventory() {
        productList.forEach(product -> System.out.println(product));
    }

}
