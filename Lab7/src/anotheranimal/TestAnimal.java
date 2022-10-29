package anotheranimal;

public class TestAnimal {
    public static void main(String[] args) {
        // Using the subclasses
        Cat cat1 = new Cat();
        cat1.greets();
        Dog dog1 = new Dog();
        dog1.greets();
        BigDog bigDog1 = new BigDog();
        bigDog1.greets();

        // Using Polymorphism
        Animal animal1 = new Cat();
        animal1.greets();
        Animal animal2 = new Dog();
        animal2.greets();
        Animal animal3 = new BigDog();
        animal3.greets();
        //        Animal animal4 = new Animal(); // Because Animal is Abstract class

        // Downcast
        Dog dog2 = (Dog) animal2;
        BigDog bigDog2 = (BigDog) animal3;
        Dog dog3 = (Dog) animal3;
        //        Cat cat2 = (Cat)animal2;
        dog2.greeting(dog3);
        dog3.greeting(dog2);
        dog2.greeting(bigDog2);
        bigDog2.greeting(dog2);
        bigDog2.greeting(bigDog1);
    }
}