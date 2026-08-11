package p10_collections;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        String line = "------------------------------";
        System.out.println(line);

        ArrayList<String> students = new ArrayList<>();
        students.add("Peter");
        students.add("Marina");
        students.add("Mika");
        System.out.println(students);

        System.out.println(line);

        HashMap<String, String> courses = new HashMap<>();
        courses.put("Peter", "Java");
        courses.put("Marina", "Python");
        courses.put("Mika", "SQL");

        for (String student : students) {
            System.out.println(student + " is learning " + courses.get(student) + ".");
        }
    }
}