package JavaPractise.InitialBasics;

class A {
    private int x;
    private static int y;

    void f1() {
        y = 22;
        x = 5;
    }

    void f2() {
        System.out.println(y);
    }

    void f3() {
        y = 45;
    }
}

public class PrivateMemberwithmultipleclass {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        a1.f1();
        a1.f2();//if f1 not  initiazes the y and x then its print 0
        a1.f3();
        //by second object
        //   a2.f1();
        a2.f2();
        a2.f3();
    }

}
