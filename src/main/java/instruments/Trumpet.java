package instruments;

public class Trumpet extends Instrument{

    private int numberOfValves;
    private String type;

    public Trumpet (FamilyType familyType, String material, double buyPrice, double sellPrice, int numberOfValves, String type){
        super(familyType, material, buyPrice, sellPrice);
        this.numberOfValves = numberOfValves;
        this.type = type;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }

    public String getType() {
        return type;
    }

    public String howToPlay(){
        return "Blow";
    }
}
