package p11_fundamentals_review;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Student peter = new Student("Peter", "Java");
        Student marina = new Student("Marina", "Python");
        Student mika = new Student("Mika", "SQL");

        Teacher john = new Teacher("John", "Java");
        Teacher bobby = new Teacher("Bobby", "SQL");

        ArrayList<Student> students = new ArrayList<>();
        students.add(peter);
        students.add(marina);
        students.add(mika);

        String line = "--------------------------";
        System.out.println(line);

        for (Student student : students) {
            student.introduce();
        }

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
    }
}