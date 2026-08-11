package p10_collections;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Peter");
        names.add("Marina");
        names.add("Mika");
        names.add("Kouso");

        String line = "--------------------------";
        System.out.println(line);

        // Get the second element.
        System.out.println("Get the second element: ");
        System.out.println(names.get(1));
        System.out.println(line);

        System.out.println("Get all elements from the ArrayList using a for loop: ");
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println(line);
        System.out.println("ArrayList<String> size: ");
        System.out.println(names.size());

        System.out.println(line);
        System.out.println("Change the third element from Mika to PAIPAI: ");
        names.set(2, "PAIPAI");
        System.out.println(names.get(2));

        System.out.println(line);
        System.out.println("Remove the fourth element, and show the current size: ");
        names.remove(3);
        System.out.println(names.size());

        System.out.println(line);
        System.out.println("Get all elements from the updated ArrayList using a for loop: ");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
