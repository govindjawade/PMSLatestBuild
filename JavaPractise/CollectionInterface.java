package JavaPractise;

import java.util.ArrayList;

public class CollectionInterface {

    public static void main(String[] args) {
        ArrayList a1=new ArrayList<>();
        a1.add("govind");//boolean function
        a1.add("kisan");
        a1.add("jawade");
        a1.add("priti");
        a1.add("shrisha");
        System.out.println(a1);
        ArrayList b1=new ArrayList<>();
        b1.add("govind1");//boolean function
        b1.add("kisan1");
        b1.add("jawade1");
        b1.add("priti1");
        b1.add("shrisha1");
        System.out.println(a1);//a1 is collection type of data
        a1.addAll(b1);
        System.out.println(a1);
        a1.removeAll(b1);
        System.out.println(a1);
        System.out.println(b1);
        a1.retainAll(b1);
        System.out.println(a1);
        System.out.println(b1);
        System.out.println(a1.isEmpty());




    }
}
