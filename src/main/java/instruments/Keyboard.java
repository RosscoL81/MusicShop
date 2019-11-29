package instruments;

import behaviours.IPlay;

public class Keyboard extends Instrument implements IPlay {

    private int numberOfKeys;

    public Keyboard(String type, String material, double buyPrice, double sellPrice, int numberOfKeys){
        super(type, material, buyPrice, sellPrice);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public String howToPlay(){
        return "Press keys";
    }
}
