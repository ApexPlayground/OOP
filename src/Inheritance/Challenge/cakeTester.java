package Inheritance.Challenge;

public class cakeTester {
    public static void main(String[] args) {
        Cake cake = new Cake();
        cake.setPrice(29.99);
        System.out.println("Cake flavour: " + cake.getFlavour());
        System.out.println("Cake Price: " + cake.getPrice());

        birthdayCake bCake = new birthdayCake();
        System.out.println("Birthday cake flavour: " + bCake.getFlavour());
        System.out.println("Birthday cake price: " + bCake.getPrice());

        weddingCake wCake = new weddingCake();
        wCake.setFlavour("pina colada");
        wCake.setPrice(450.55);
        System.out.println("Wedding cake flavour: " + wCake.getFlavour());
        System.out.println("Wedding cake price: " + wCake.getPrice());
    }
}
