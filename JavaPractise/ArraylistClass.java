package JavaPractise;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistClass {

    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();
        a1.add("govind");//boolean function
        a1.add("kisan");
        a1.add("jawade");
        a1.add("priti");
        a1.add("priti");
        a1.add("shrisha");
        a1.add(0,"rane");
        System.out.println(a1);
        System.out.println(a1.size());
        ArrayList b1 = new ArrayList();
        b1.add(1);//boolean function
        b1.add(12);
        b1.add(2);
        b1.add(3);
        b1.add(3);
        b1.add(4);
        Collections.sort(b1);
        System.out.println(b1);
    }
}
