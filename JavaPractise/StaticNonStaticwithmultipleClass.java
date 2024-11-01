package JavaPractise;

class Area {
    static void f1() {
        System.out.println("area 1");
    }

    static void f2() {
        System.out.println("area 2");
    }
}

public class StaticNonStaticwithmultipleClass {
    void f1() {
        System.out.println("f1");
    }

    static void f2() {
        System.out.println("f2");
    }

    public static void main(String[] args) {
        System.out.println("this is main class");
        f2();//no need to create oblect
        StaticNonStatic s1=new StaticNonStatic();
        s1.f1(); //for non static need to create object
        //for other class element
        Area.f1();
        Area.f2();
    }
}
