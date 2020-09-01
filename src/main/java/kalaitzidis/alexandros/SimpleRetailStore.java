package kalaitzidis.alexandros;

public class SimpleRetailStore implements IStore{
    private double totalBuyBalance;
    private double totalSellBalance;

    public SimpleRetailStore() {
    }

    public SimpleRetailStore(double totalBuyBalance, double totalSellBalance) {
        this.totalBuyBalance = totalBuyBalance;
        this.totalSellBalance = totalSellBalance;
    }

    public double getTotalBuyBalance() {
        return totalBuyBalance;
    }

    public void setTotalBuyBalance(double totalBuyBalance) {
        this.totalBuyBalance = totalBuyBalance;
    }

    public double getTotalSellBalance() {
        return totalSellBalance;
    }

    public void setTotalSellBalance(double totalSellBalance) {
        this.totalSellBalance = totalSellBalance;
    }

    @Override
    public void buy(Product product) {

    }

    @Override
    public void sell(Product product) {

    }

    @Override
    public double getRevenue() {
        return 0;
    }
}
