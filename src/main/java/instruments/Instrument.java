package instruments;


import behaviours.IPlay;
import behaviours.ISell;

public abstract class Instrument implements ISell, IPlay {
    private FamilyType familyType;
    private String material;
    private double buyPrice;
    private double sellPrice;

    public Instrument(FamilyType familyType, String material, double buyPrice, double sellPrice){
        this.familyType = familyType;
        this.material = material;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public FamilyType getFamilyType() {
        return this.familyType;
    }

    public String getMaterial() {
        return this.material;
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
