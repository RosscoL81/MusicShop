import behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;
    private double till;

    public Shop(String name, double till){
        this.name = name;
        this.till = till;
        this.stock = new ArrayList<ISell>();
    }

    public String getName() {
        return this.name;
    }

    public double getTill() {
        return this.till;
    }

    public void addStock(ISell item){
        this.stock.add(item);
    }

    public int getStockCount() {
        return stock.size();
    }

    public void removeStock(ISell item) {
        this.stock.remove(item);
    }

    public double getPotentialProfit() {
        double profit = 0;
        for (ISell item : this.stock) {
            profit += item.calculateMarkUp();
        }
        return profit;
    }

//    public double discountForStudents(Customer customer, ISell item){
//        if (customer.getEmploymentStatus() == "student"){
//            item.getSellPrice()*0.8
//        }
//    }

    public void sellToCustomer(ISell item, Customer customer){
        this.stock.remove(item);
        this.till += item.getSellPrice();
        customer.makePurchase(item);
    }
}
