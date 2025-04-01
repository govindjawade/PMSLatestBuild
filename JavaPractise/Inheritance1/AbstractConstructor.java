package JavaPractise.Inheritance1;

abstract class Demo11 {
    Demo11(int x) {
        System.out.println("parrent constructor"+x);
    }
}

class Demo2 extends Demo11 {

    Demo2() {
        super(5);
        System.out.println("child contructor");
    }
}

public class AbstractConstructor {
    public static void main(String[] args) {
        //Demo1 d1=new Demo1() ;
        Demo2 d2 = new Demo2();

    }
}
