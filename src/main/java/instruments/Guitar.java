package instruments;

import behaviours.IPlay;

public class Guitar extends Instrument implements IPlay {

    private int numberOfStrings;

    public Guitar(String type, String material, double buyPrice, double sellPrice, int numberOfStrings){
        super(type, material, buyPrice, sellPrice);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return this.numberOfStrings;
    }

    public String howToPlay(){
        return "Strum";
    }


}
