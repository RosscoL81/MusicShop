import behaviours.ISell;

import java.util.ArrayList;

public class Customer {

    private String employmentStatus;
    private int wallet;
    private ArrayList<ISell> purchases;

    public Customer(String employmentStatus, int wallet){
        this.employmentStatus = employmentStatus;
        this.wallet = wallet;
        this.purchases = new ArrayList<ISell>();
    }

    public String getEmploymentStatus() {
        return this.employmentStatus;
    }

    public int getWallet() {
        return this.wallet;
    }

    public int numberOfPurchases(){
        return this. purchases.size();
    }

    public void makePurchase(ISell item){
        this.purchases.add(item);
        this.wallet -= item.getSellPrice();
    }

}
