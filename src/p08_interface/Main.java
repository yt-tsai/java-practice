package p08_interface;

public class Main {

    public static void main(String[] args) {

        Animal animal1 = new Dog("Kubi");
        Animal animal2 = new Cat("Lozo");

        animal1.makeSound();
        animal2.makeSound();

        Animal[] animals = {
                new Dog("Kubi2"),
                new Cat("Lozo2")
        };

        String line = "-----------------------------";
        System.out.println(line);

        for (Animal animal : animals) {
            animal.makeSound();
        }

        System.out.println(line);

        Duck duck = new Duck("Dona");
        Animal animal3 = duck;
        Flyable flyingObject = duck;

        duck.makeSound();
        duck.fly();

        System.out.println(line);

        animal3.makeSound();
        // animal3.fly();
        // Cannot be called because fly() is not defined in Animal.

        flyingObject.fly();
        // flyingObject.makeSound();
        // Cannot be called because makeSound() is not defined in Flyable.

    }

}