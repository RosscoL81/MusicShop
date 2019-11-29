package instruments;


public class Guitar extends Instrument {

    private int numberOfStrings;
    private String type;

    public Guitar(FamilyType familyType, String material, double buyPrice, double sellPrice, int numberOfStrings, String type){
        super(familyType, material, buyPrice, sellPrice);
        this.numberOfStrings = numberOfStrings;
        this.type = type;
    }

    public int getNumberOfStrings() {
        return this.numberOfStrings;
    }

    public String howToPlay(){
        return "Strum";
    }


    public String getType() {
        return type;
    }
}
