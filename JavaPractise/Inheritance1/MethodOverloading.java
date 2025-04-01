package JavaPractise.Inheritance1;

class Overloaing { //method name same but argu diff
    void f1() {
        System.out.println("without parameters");
    }

    void f1(int x) {
        System.out.println("with parameter= " + x);
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Overloaing o1 = new Overloaing();
        o1.f1();
        o1.f1(6);
    }
}
