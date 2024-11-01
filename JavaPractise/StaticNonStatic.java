package JavaPractise;

public class StaticNonStatic {
    void f1() {
        System.out.println("print a");
    }

   static void f2() {
        System.out.println("print b");
    }

    public static void main(String[] args) {
        System.out.println("print C");
       // f1();//non-static method f1() cannot be referenced from a static context for that b+need to create object
        StaticNonStatic b1=new StaticNonStatic();
        b1.f1();
        f2();//no need to create object of static methods
    }
}
