package JavaPractise;

class Demo {
    int x = 10;
    private int z = 20;
    private static int t = 30;
    private static int u = 50;

    void f1() {
        System.out.println(z);
        System.out.println(t);
    }

    static void f2() {
        System.out.println(u);
    }
}

public class Privatefunctionvariable {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        System.out.println(d1.x);
        //  System.out.println(d1.z);//we cant access directly private membet to main as scope is in demo
        d1.f1();
        Demo.f2();//if dont to create a object to access private static members we have to make functions as static
    }
}
