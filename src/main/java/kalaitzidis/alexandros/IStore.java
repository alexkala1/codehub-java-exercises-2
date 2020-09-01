package kalaitzidis.alexandros;

public interface IStore {
    void buy(Product product);
    void sell(Product product);
    double getRevenue();
}
