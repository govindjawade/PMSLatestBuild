package JavaPractise.Inheritance1;

//multiple parrent multiple child
class Parrent1 {
    void parrent() {
        System.out.println("parrent executed");
    }
}

class Child1 extends Parrent1 {

    void child() {
        System.out.println("child 1 executed");
    }
}

class Child2 extends Child1 {
    void childtwo() {
        System.out.println("child 2 executed");
    }
}

public class MultilevelInheticae {
    public static void main(String[] args) {
        Child2 c2 = new Child2();
        c2.childtwo();
        c2.child();
        c2.parrent();
    }
}
