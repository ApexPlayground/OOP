package Polymorphism;

public class Cat extends Animal{

    @Override
    public void makeSound(){
        System.out.println("meow");
    }

    public void scratch(){
        System.out.println("i'm about that life boy");
    }
}
