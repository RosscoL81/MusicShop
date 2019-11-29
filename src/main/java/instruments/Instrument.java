package instruments;


import behaviours.ISell;

public abstract class Instrument implements ISell {
    private String type;
    private String material;
    private double buyPrice;
    private double sellPrice;

    public Instrument(String type, String material, double buyPrice, double sellPrice){
        this.type = type;
        this.material = material;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getType() {
        return this.type;
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
