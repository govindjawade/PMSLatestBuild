package JavaPractise;

class Substraction {
    int a = 10;
    int b = 8;

    static void sub() {
        System.out.println("if static function defined in other class then nedd to write class name ");
    }

    void mul() {
        System.out.println(a * b);
    }
}

public class StaticNonStaticfunctions {
    static int x = 5, y = 5;

    static void add() {
        System.out.println(x + y);
    }

    public static void main(String[] args) {
        System.out.println("c");
        add();//withing same class no need of StaticNonStaticfunctions.add
        Substraction.sub();
        Substraction s1 = new Substraction();

        System.out.println(s1.a - s1.b);

        s1.mul();//need to create object for non static method
    }
}
