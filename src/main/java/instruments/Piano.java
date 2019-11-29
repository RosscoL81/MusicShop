package instruments;

import behaviours.IPlay;

public class Piano extends Instrument{

    private int numberOfKeys;

    public Piano(FamilyType familyType, String material, double buyPrice, double sellPrice, int numberOfKeys){
        super(familyType, material, buyPrice, sellPrice);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public String howToPlay(){
        return "press keys";
    }
}
