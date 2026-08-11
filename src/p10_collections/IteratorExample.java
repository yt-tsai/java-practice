package p10_collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Peter");
        names.add("Marina");
        names.add("PAIPAI");
        names.add("Mika");

        System.out.println("Get all elements from the ArrayList using a for loop: ");
        for (String name : names) {
            System.out.println(name);
        }

        String line = "------------------------------";
        System.out.println(line);

        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {

            String name = iterator.next();

            System.out.println(name);
        }

        System.out.println(line);
        Iterator<String> iterator2 = names.iterator();

        while (iterator2.hasNext()) {

            String name = iterator2.next();

            if (name.equals("Marina")) {
                iterator2.remove();
            }
        }
        System.out.println(names);

        // System.out.println(line);
        // System.out.println("Remove Marina using a for loop:");
        // for (String name : names) {
        // if (name.equals("Marina")) {
        // names.remove(name);
        // }
        // System.out.println(names);
        // }

    }
}