package Inheritance.Challenge;

public class weddingCake extends Cake{
    protected String tiers;

    public weddingCake(){
        setFlavour("Almond");
    }
    public String getTiers() {
        return tiers;
    }

    public void setTiers(String tiers) {
        this.tiers = tiers;
    }
}
