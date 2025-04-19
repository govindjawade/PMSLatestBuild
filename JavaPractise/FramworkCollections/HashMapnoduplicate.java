package JavaPractise.FramworkCollections;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.HashSet;

public class HashMapnoduplicate {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Apple");// Duplicate ignored
        System.out.println(set);

    }
}
