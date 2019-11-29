package items;

import behaviours.ISell;

public abstract class Accessory implements ISell {

    private String description;
    private double buyPrice;
    private double sellPrice;

    public Accessory(String description, double buyPrice, double sellPrice){
        this.description = description;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getDescription() {
        return this.description;
    }

    public double getBuyPrice() {
        return this.buyPrice;
    }

    public double getSellPrice() {
        return this.sellPrice;
    }

    public double calculateMarkUp() {
        return (this.sellPrice - this.buyPrice);
    }
}
