package Inheritance.Challenge;

public class Cake {
    protected String flavour;
    protected double price;

    public Cake(){
       setFlavour("vanilla");
       setPrice(100.45);
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
