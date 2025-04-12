package JavaPractise.Collectionss;

import java.util.ArrayList;

public class ListInterface {

    public static void main(String[] args) {
        ArrayList a1=new ArrayList();
        a1.add("govind");//boolean function
        a1.add("kisan");
        a1.add("jawade");
        a1.add("priti");
        a1.add("priti");
        a1.add("shrisha");
        System.out.println(a1);
     //   a1.add(0,"motu");//list ka function
     //   a1.set(1,"patalu");//replace element
//System.out.println(a1.get(5));
        System.out.println(a1);
        System.out.println(a1.indexOf("patalu"));
        System.out.println(a1.indexOf("priti"));
        System.out.println(a1.lastIndexOf("priti"));

        System.out.println(a1.subList(0,2));


    }
}
