package JavaPractise.Inheritance1;

abstract class Demo11 {
    Demo11() {
        System.out.println("parrent constructor");
    }
}

class Demo2 extends Demo11 {
    Demo2() {
        System.out.println("child contructor");
    }
}

public class AbstractConstructor {
    public static void main(String[] args) {
        //Demo1 d1=new Demo1() ;
        Demo2 d2 = new Demo2();

    }
}
