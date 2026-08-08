package p07_polymorphism;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("The dog " + getName() + " says: Woof!!");
    }

    public void fetch() {
        System.out.println(getName() + " is fetching the ball.");
    }

}