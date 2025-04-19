package JavaPractise.FramworkCollections;

import java.util.HashMap;
import java.util.Hashtable;

public class Hashmapvshashtable {
    public static void main(String[] args) {
        //both we used for mapping
        //both works on keys and values
        //hasmap faster than hashtable
        //hashmap is non synchroni but hashtable is
        //hashmap allowed one null key with multiple keyvalues hashtable not allowed
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(null, "NullKey"); // Allowed
        map.put(3, null);         // Allowed
        System.out.println(map);
        Hashtable<Integer, String> table = new Hashtable<>();
        table.put(1, "Apple");
        table.put(2, "Banana");

        // table.put(null, "NullKey"); // Throws NullPointerException!
        // table.put(3, null);         // Throws NullPointerException!

        System.out.println(table);
    }





}
