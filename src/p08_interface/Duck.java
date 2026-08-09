package p08_interface;

public class Duck implements Animal, Flyable {

    private String name;

    public Duck(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println("I am a duck, and my name is " + name + ". DaDaDa !!!!");
    }

    @Override
    public void fly() {
        System.out.println("I am flying in the blue sky !!!!");

    }

}