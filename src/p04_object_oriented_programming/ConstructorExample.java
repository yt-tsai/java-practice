package p04_object_oriented_programming;

public class ConstructorExample {

    public static void main(String[] args) {

        Person person = new Person("Peter", 41);

        System.out.println("Name: " + person.name);
        System.out.println(" Age: " + person.age);
    }
}