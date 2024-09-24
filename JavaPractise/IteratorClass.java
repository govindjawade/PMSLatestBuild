package JavaPractise;

import java.util.ArrayList;
import java.util.Iterator;


public class IteratorClass {

    public static void main(String[] args) {

        // Use a typed ArrayList for storing Strings
                ArrayList a1 = new ArrayList();
        a1.add("govind");//boolean function

        a1.add("kisan");
        a1.add("jawade");
        a1.add("priti");
        a1.add("priti");
        a1.add("shrisha");
        System.out.println(a1);

        // Use an Iterator<String> for type safety
        Iterator<String> G1 = a1.iterator();

        while (G1.hasNext()) {
            // Fetch and print the next element
            String s1 = G1.next();
            if (s1!="kisan") {
                System.out.println(s1);
            }
            // Check if the next
        }
    }
}
