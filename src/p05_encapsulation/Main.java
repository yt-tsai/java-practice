package p05_encapsulation;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("Peter", 41);
        Person person2 = new Person("Marina", 30);
        String line = "------------------------";

        System.out.println();
        System.out.println("Hi " + person1.getName());
        System.out.println("Age : " + person1.getAge());
        System.out.println(line);

        System.out.println("Classmate:");
        System.out.println("Name: " + person2.getName());
        System.out.println("Age : " + person2.getAge());
        System.out.println(line);

        person2.setName("Linda");
        person2.setAge(20);
        System.out.println("Name: " + person2.getName());
        System.out.println("Age : " + person2.getAge());
        System.out.println(line);

        person2.setAge(-20);
        System.out.println("Name: " + person2.getName());
        System.out.println("Age : " + person2.getAge());
        System.out.println(line);
    }
}