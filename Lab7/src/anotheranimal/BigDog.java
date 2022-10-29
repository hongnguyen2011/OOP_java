package anotheranimal;

public class BigDog extends Dog {
    @Override
    public void greets() {
        System.out.println("Woow!");
    }

    @Override
    public void greeting(Dog another) {
        System.out.println("Woooooowwwww!");
    }
}