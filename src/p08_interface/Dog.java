package p08_interface;

public class Dog implements Animal {

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println("I am a dog, and my name is " + name + ". Woof !!!!");
    }
}