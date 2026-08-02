package p04_object_oriented_programming;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("Peter", 41);
        Person person2 = new Person("Marina", 20);
        Person person3 = new Person();

        System.out.println(person1.name + " " + person1.age);
        System.out.println(person2.name + " " + person2.age);
        System.out.println(person3.name + " " + person3.age);

    }
}