package kalaitzidis.alexandros.StoreCategories;

import kalaitzidis.alexandros.Models.Product;
import kalaitzidis.alexandros.Models.Store;

public class SimpleRetailStore extends Store {
    private double totalBuyBalance;
    private double totalSellBalance;

    public SimpleRetailStore() {
    }

    @Override
    public void buy(Product product) {
        this.totalBuyBalance += product.getPriceWhenBuy();
    }

    @Override
    public void sell(Product product) {
        this.totalSellBalance += product.getPriceWhenSell();
    }

    @Override
    public double getRevenue() {
        return totalSellBalance - totalBuyBalance;
    }

    @Override
    public void getInventory() {

    }
}
