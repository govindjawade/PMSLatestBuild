package JavaPractise.Inheritance1;

class Example1 {
    int x = 1000;
    int y = 2000;

    void f1() {
        int x = 10;
        int y = 20;
        System.out.println(x);
        System.out.println(y);
    }
}

class Example2 extends Example1 {
    int x = 50;
    int y = 100;

    void f2() {
        int x = 785;
        int y = 857;
        System.out.println(x);
        System.out.println(y);
        System.out.println(this.x);
        System.out.println(this.y);//this point to current class object global variable
        System.out.println(super.x);//sup point to parrent global
        System.out.println(super.y);
    }
}

public class Superkeyword {
    public static void main(String[] args) {
        Example2 e2 = new Example2();
        e2.f2();
    }
}
