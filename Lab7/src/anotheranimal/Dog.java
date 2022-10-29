package anotheranimal;

public class Dog extends Animal {
    @Override
    public void greets() {
        System.out.println("Woof!");
    }

    public void greeting(Dog another) {
        System.out.println("Woooooooooof!");
    }
}