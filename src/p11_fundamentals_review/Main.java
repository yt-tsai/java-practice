package p11_fundamentals_review;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Peter", "Java"));
        students.add(new Student("Marina", "Python"));
        students.add(new Student("Mika", "SQL"));

        for (Student student : students) {

            student.introduce();

        }

    }
}