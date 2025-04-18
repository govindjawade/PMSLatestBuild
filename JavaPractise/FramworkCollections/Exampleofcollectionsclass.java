package JavaPractise.FramworkCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exampleofcollectionsclass {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>(Arrays.asList(5, 3, 8, 1, 9,3,3));
        System.out.println("originel number" + number);

        //sort
       Collections.sort(number);
        System.out.println(number);

        //reverse
        Collections.reverse(number);
        System.out.println(number);

        Collections.shuffle(number);
        System.out.println(number);

        //find max
       int max= Collections.max(number);
        System.out.println(max);
        //min
        int min=Collections.min(number);
        System.out.println(min);
        //frequency
        int freq=Collections.frequency(number,1);
        System.out.println(freq);
        //swap
        Collections.swap(number,0,number.size()-1);
        System.out.println(number);
        Collections.fill(number, 100);
        System.out.println("After Filling with 100: " + number);
        // Copy elements from one list to another
        List<Integer> source = Arrays.asList(10, 20, 30, 40, 50, 60);
        List<Integer> dest = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0, 0));
        Collections.copy(dest, source);
        System.out.println("Destination after Copy: " + dest);
        Collections.sort(dest);
        int index = Collections.binarySearch(dest, 30);
        System.out.println("Index of 30 after Binary Search: " + index);
    }
}
