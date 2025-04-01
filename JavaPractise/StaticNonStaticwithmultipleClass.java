package JavaPractise;

class Area {
    static void f1() {
        System.out.println("area 1");
    }

    static void f2() {
        System.out.println("area 2");
    }

    void f3() {
        System.out.println("nonstaticin other class");
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
        StaticNonStaticwithmultipleClass s1 = new StaticNonStaticwithmultipleClass();
        s1.f1(); //for non static need to create object
        //for other class element
        Area.f1();//class name followed by function name
        Area.f2();
        //Area.f3();
        Area a11 = new Area();
        a11.f3();
    }
}
