package Polymorphism;

public class Zoo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.fetch();
        dog.makeSound();

        Animal greg = new Dog();
        greg.makeSound();

        //change to cat
        greg = new Cat();
        greg.makeSound();

        //Type Casting
        ((Dog)greg).fetch();

        //instanceOf
        boolean isDog = true;
        System.out.println(isDog);
    }
}
