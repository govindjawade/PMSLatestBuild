package JavaPractise.FramworkCollections;

import java.util.LinkedHashSet;

public class Maintainsinsertionorder {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set=new LinkedHashSet<>();
        set.add(10);
        set.add(20);
        set.add(10);// Duplicate ignored
        System.out.println(set);
    }
}
