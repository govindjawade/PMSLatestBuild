package JavaPractise;

import org.w3c.dom.ls.LSOutput;

class Demo1 {
    int x;
    int y;

    Demo1(int p, int q) {
        x = p;
        y = q;
    }

    public Demo1() {
        System.out.println("withouth arg");
    }
}

public class Constructor2 {
    public static void main(String[] args) {
        Demo1 d1 = new Demo1(5, 9);
        System.out.println(d1.x);
        System.out.println(d1.y);
        Demo1 d2 = new Demo1();
    }


}
