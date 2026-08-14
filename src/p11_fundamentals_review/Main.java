package p11_fundamentals_review;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        Student peter = new Student("Peter", "Java");
        Student marina = new Student("Marina", "Python");
        Student mika = new Student("Mika", "SQL");

        Teacher john = new Teacher("John", "Java");
        Teacher bobby = new Teacher("Bobby", "SQL");

        // Use ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();
        students.add(peter);
        students.add(marina);
        students.add(mika);

        String line = "--------------------------";
        System.out.println(line);

        for (Student student : students) {
            student.introduce();
        }

        // Polymorphism example (using the Person parent class)
        ArrayList<Person> people = new ArrayList<>();
        people.add(peter);
        people.add(marina);
        people.add(john);
        people.add(bobby);

        System.out.println(line);
        System.out.println("Polymorphism example (using the Person parent class):");
        for (Person person : people) {

            person.introduce();
        }

        // Polymorphism example (using the Workable interface)
        ArrayList<Workable> workers = new ArrayList<>();
        workers.add(peter);
        workers.add(marina);
        workers.add(john);
        workers.add(bobby);

        System.out.println(line);
        System.out.println("Polymorphism example (using the Workable interface):");
        for (Workable worker : workers) {
            worker.work();
        }

        // Use HashMap<>();
        HashMap<String, Person> personMap = new HashMap<>();

        personMap.put("Peter", peter);
        personMap.put("Marina", marina);
        personMap.put("John", john);
        personMap.put("Bobby", bobby);

        Person foundPerson = personMap.get("PAIPAI");

        System.out.println(line);
        System.out.println("HashMap example with polymorphism:");

        // For an expected situation, using if/else is better than
        // relying on exception handling.
        // try {
        // foundPerson.introduce();
        // } catch (NullPointerException e) {
        // System.out.println("Person cannot be found.");
        // e.printStackTrace();
        // }

        if (foundPerson != null) {
            foundPerson.introduce();
        } else {
            System.out.println("Person cannot be found.");
        }

        System.out.println("Program continues.");
    }
}