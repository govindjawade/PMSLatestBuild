package JavaPractise.FramworkCollections;

import java.util.PriorityQueue;

public class FIFO {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(30);
        queue.add(10);
        queue.add(20);
        System.out.println(queue.poll());  // Smallest element
    }
}
