package animals;

public class TestMain {
    public static void main(String[] args) {
        Animal animal = new Animal("Ani");
        System.out.println(animal);
        Animal mammal = new Mammal("Mam");
        System.out.println(mammal);
        Animal cat = new Cat("Ket");
        System.out.println(cat);
        ((Cat) cat).greets();
        Dog dog = new Dog("Woof");
        System.out.println(dog);
        dog.greets();
        animal = new Dog("Woooof");
        dog.greets((Dog) animal);
    }
}
