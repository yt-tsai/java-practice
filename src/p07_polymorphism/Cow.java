package p07_polymorphism;

public class Cow extends Animal {

    public Cow(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("The cow " + getName() + " says: Moo~~~~~~~");
    }

}