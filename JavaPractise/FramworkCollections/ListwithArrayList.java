package JavaPractise.FramworkCollections;

import java.util.ArrayList;
import java.util.List;

public class ListwithArrayList {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        // Add elements
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        names.add(3, "jadu");
        System.out.println(names);
        // Get element
        System.out.println(names.get(1));
        names.set(2, "bob replace by tom");
        System.out.println(names);
        // Check for element
        System.out.println(names.contains("Alice"));
        System.out.println(names.size());
        System.out.println(names);
        // Sublist
        List<String> sub = names.subList(1, 2);
        System.out.println("Sublist: " + sub);
        System.out.println(names.remove(0));
        System.out.println(names);
        // Sort list
        names.sort(null);  // Natural order
        System.out.println("Sorted List: " + names);
    }
}
