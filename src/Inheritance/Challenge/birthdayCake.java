package Inheritance.Challenge;

public class birthdayCake extends Cake{
    protected boolean candles;

    @Override
    public void setFlavour(String flavour) {
        super.setFlavour("chocolate");
    }

    public boolean isCandles() {
        return candles;
    }

    public void setCandles(boolean candles) {
        this.candles = candles;
    }
}
