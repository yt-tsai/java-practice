package p10_collections;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {

        HashMap<String, String> countries = new HashMap<>();

        countries.put("JP", "Japan");
        countries.put("TW", "Taiwan");
        countries.put("US", "United States");

        String line = "------------------------------";
        System.out.println(line);
        System.out.println(countries.get("JP"));
        System.out.println(countries.get("TW"));
        System.out.println(countries.get("US"));

        System.out.println(line);
        System.out.println("How many entries are in the HashMap? ");
        System.out.println(countries.size());

        System.out.println(line);
        System.out.println("Check whether the keys exist:");
        System.out.println("Does the HashMap contain the key \"JP\"? "
                + countries.containsKey("JP"));
        System.out.println("Does the HashMap contain the key \"KR\"? "
                + countries.containsKey("KR"));

        System.out.println(line);
        countries.remove("US");
        System.out.println("Remove \"US\" and show the entry size again: ");
        System.out.println(countries.size());

        System.out.println(line);
        countries.put("JP", "JAPAN(update)");
        System.out.println(countries.get("JP"));
        System.out.println(countries.size());

        System.out.println(line);
        System.out.println("Show all the entries in HashMap using a for loop: ");
        for (String key : countries.keySet()) {
            System.out.println(key + " : " + countries.get(key));
        }

    }
}