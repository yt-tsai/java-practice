package p08_interface;

public class Cat implements Animal {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println("I am a cat, and my name is " + name + ". Meow~~~!!");
    }
}