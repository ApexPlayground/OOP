package Inheritance.Vehicle;

public class tester {
    public static void main(String[] args) {
        Coupe myCar = new Coupe();
        myCar.setColour("red");

        System.out.println("Car colour: " + myCar.getColour() + "\n" + "Car door: " + myCar.getDoors());
    }
}
