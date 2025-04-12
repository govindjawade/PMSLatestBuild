package JavaPractise.inheritanceTheory;
//one parrent one child
class Parrent {
    int x;
    int y;

    void f1() {
        System.out.println("parrent executed");
    }
}

class Child extends Parrent{
    int z;

    void f2() {
        System.out.println("child executed");
    }
}

public class Signleinherittance {
    public static void main(String[] args) {
        Child c1=new Child();
        c1.f1();
        c1.f2();
    }
}
