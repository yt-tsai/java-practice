package p07_polymorphism;

public class Main {

    public static void main(String[] args) {

        String line = "----------------------------------------";
        Animal animal1 = new Dog("Kubi");

        Dog downcastDog1 = (Dog) animal1;

        System.out.println(line);
        downcastDog1.fetch();
        System.out.println(line);

        Animal animal2 = new Cat("Lozo");

        if (animal2 instanceof Dog) {
            Dog downcastDog2 = (Dog) animal2;
            downcastDog2.fetch();
        } else {
            System.out.println("animal2 is not a Dog, so it cannot be downcast to Dog.");
        }

        System.out.println(line);

        animal1.makeSound();
        animal2.makeSound();

        System.out.println(line);

        // Different Animal subclasses can be stored in the same Animal array.
        Animal[] animals = {
                new Dog("Kubi"),
                new Cat("Lozo"),
                new Dog("Kubyy"),
                new Cat("Lozomy"),
                new Cow("MilkCoCo") // A new subclass (Cow) can be added without changing the loop below.
        };

        for (Animal animal : animals) {
            animal.makeSound();
        }

    }
}