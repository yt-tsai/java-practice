package p04_object_oriented_programming;

public class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
        this.name = "Unknown";
        this.age = 0;

    }
}
